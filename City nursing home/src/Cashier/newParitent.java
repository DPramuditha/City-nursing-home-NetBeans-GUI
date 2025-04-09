/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cashier;
import city.nursing.home.AddNewPatient;
import java.time.LocalDate;

public class newParitent {
   private String fullName;
   private int age;
   private String contactInformation;
   private LocalDate dateOfBirth;
   private String gender;
   private String patientCategory;
   private LocalDate newPatientDate;
   
   public String getFullName() {
       return fullName;
   }

   public void setFullName(String fullName) {
       this.fullName = fullName;
   }

   public int getAge() {
       return age;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public String getContactInformation() {
       return contactInformation;
   }

   public void setContactInformation(String contactInformation) {
       this.contactInformation = contactInformation;
   }

   public LocalDate getDateOfBirth() {
       return dateOfBirth;
   }

   public void setDateOfBirth(LocalDate dateOfBirth) {
       this.dateOfBirth = dateOfBirth;
   }

   public String getGender() {
       return gender;
   }

   public void setGender(String gender) {
       this.gender = gender;
   }

   public String getPatientCategory() {
       return patientCategory;
   }

   public void setPatientCategory(String patientCategory) {
       this.patientCategory = patientCategory;
   }

   public LocalDate getNewPatientDate() {
       return newPatientDate;
   }

   public void setNewPatientDate(LocalDate newPatientDate) {
       this.newPatientDate = newPatientDate;
   }
   
}
