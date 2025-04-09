/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Doctor;

import java.time.LocalDate;

public class NewDoctor {
   private String doctorId;
   private String doctorName;
   private LocalDate dateOfBirth;
   private String yearsOfExperience;
   private String specialization;
   private LocalDate availableDays;
   
   
    public NewDoctor(String doctorId, String doctorName, LocalDate dateOfBirth, String yearsOfExperience, String specialization,LocalDate availableDays) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.dateOfBirth = dateOfBirth;
        this.yearsOfExperience = yearsOfExperience;
        this.specialization = specialization;
        this.availableDays = availableDays;
    }
    
     public String getDoctorId() {
        return doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getSpecialization() {
        return specialization;
    }

    public LocalDate getAvailableDays() {
        return availableDays;
    }
    
    
     public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setYearsOfExperience(String yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setAvailableDays(LocalDate availableDays) {
        this.availableDays = availableDays;
    }
}
