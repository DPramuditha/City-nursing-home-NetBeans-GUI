/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package city.nursing.home;


public class User {
  
     public void showDashboard() {
        System.out.println("Welcome to the system!");
        homecityNursing backToMain = new homecityNursing();
        backToMain.setVisible(true);
    }  
}

class Manager extends User {
        public Manager() {
    
    }
        @Override
    public void showDashboard() {
        System.out.println("Welcome, Manager!");
        CreateNewAccount createAccount = new CreateNewAccount();
        createAccount.setVisible(true);
        
    }
}

class Doctor extends User {
        public Doctor() {
  
    }
        @Override
        public void showDashboard() {
            System.out.println("Welcome, Doctor!");
            DoctorCityNursing doctor = new DoctorCityNursing();
            doctor.setVisible(true);
       
    }
}
class Administrator extends User {
        public Administrator() {
       
    }
        @Override
        public void showDashboard() {
            System.out.println("Welcome, Administrator!");
            AdminnistratorCityNursing admin = new AdminnistratorCityNursing();
            admin.setVisible(true);
       
    }
}
class Cashier extends User {
         public Cashier() {
      
    }
         @Override
    public void showDashboard() {
        System.out.println("Welcome, Cashier!");
        PatientBookingInformation patientBookingInfo = new PatientBookingInformation();
        patientBookingInfo.setVisible(true);
    }
}
