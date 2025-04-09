/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import Doctor.NewDoctor;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class saveNewDoctor {
    public void saveNewDoctor(String filePath, NewDoctor newDoctor) {
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String newDoctorDetails = "Doctor ID: " + newDoctor.getDoctorId() + "\n" +
                                  "Name: Dr." + newDoctor.getDoctorName() + "\n" +
                                  "Date of Birth: " + newDoctor.getDateOfBirth().format(formatter) + "\n" +
                                  "Years of Experience: " + newDoctor.getYearsOfExperience() + "\n" +
                                  "Specialization: " + newDoctor.getSpecialization() + "\n" +
                                  "Available Days: " + newDoctor.getAvailableDays() + "\n";

       
        writer.write(newDoctorDetails);
        writer.newLine();
        writer.write("==========================================================");
        writer.newLine();

       
        System.out.println("Successfully registered a new doctor...");
        JOptionPane.showMessageDialog(null, "Successful! Registered New Doctor", "Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        System.err.println("Error saving doctor details: " + e.getMessage());
    }
}
}
