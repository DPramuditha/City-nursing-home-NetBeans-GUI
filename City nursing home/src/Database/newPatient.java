/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Cashier.newParitent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import javax.swing.JOptionPane;
public class newPatient {
    public void SaveNewPatient(String filepath,newParitent newpatient ){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("newPatient.txt", true))) {
   String newPatientDetails = "Name: " + newpatient.getFullName() + "\n" +
                               "Age: " + newpatient.getAge() + "\n" +
                               "Contact: " + newpatient.getContactInformation() + "\n" +
                               "Date of Birth: " + newpatient.getDateOfBirth() + "\n" +
                               "Gender: " + newpatient.getGender() + "\n" +
                               "Category: " + newpatient.getPatientCategory() + "\n" +
                               "New Patient Date: " + newpatient.getNewPatientDate() + "\n";
        writer.append(newPatientDetails);
        writer.newLine();
        writer.append("==========================================================");
        writer.newLine();
        System.out.println("Successfully Register A New Patient...");
        JOptionPane.showMessageDialog(null, "Successful! Register New Patient","Success", JOptionPane.INFORMATION_MESSAGE);
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
//    public String readNewPatient(String filepath){
//               StringBuilder content = new StringBuilder();    
//       try (BufferedReader reader = new BufferedReader(new FileReader("newPatient.txt"))) {
////            StringBuilder content = new StringBuilder();
//            String line;
//            String lastLine = "";
//            while ((line = reader.readLine()) != null) {
//                content.append(line).append("\n");
//                System.out.println(line);
////                lastLine = line;
//            }
////            jTextArea1.setText(content.toString());
//////            jTextArea1.setText(lastLine);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null,"Error reading file: " + e.getMessage());
//            System.out.println(e);
//        } 
//       return content.toString();
//    }
//}
