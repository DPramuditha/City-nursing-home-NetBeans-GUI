/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;

import city.nursing.home.AdminnistratorCityNursing;
import javax.swing.*;
import city.nursing.home.CreateNewAccount;
import city.nursing.home.DoctorCityNursing;
import city.nursing.home.homecityNursing;
import javax.swing.JFrame;

public class LoginScreen extends JFrame{
    
  
    public LoginScreen() {
        homecityNursing backToMain = new homecityNursing();
        backToMain.setVisible(true);
    }

    
    protected void navigateTo(LoginScreen nextScreen) {
        this.setVisible(false); 
//        nextScreen.setVisible(true); 
    }
    
    public class ManagerLogin extends LoginScreen {
    public ManagerLogin() {
        setTitle("Manager Login");
       
    }

    public void performManagerAction() {
        System.out.println("Manager-specific action performed.");
      
        CreateNewAccount createAccount = new CreateNewAccount();
//        navigateTo(createAccount);
        createAccount.setVisible(true);
    }
    }
    
    public class DoctorLogin extends LoginScreen {
    public DoctorLogin() {
        setTitle("Doctor Login");
    }

    public void performDoctorAction() {
        System.out.println("Doctor-specific action performed.");
        DoctorCityNursing doctor = new DoctorCityNursing();
//        navigateTo(doctor);
        doctor.setVisible(true);

    }
}
    
    public class AdministratorLogin extends LoginScreen {
    public AdministratorLogin() {
        setTitle("Administrator Login");
      
    }

    public void performAdministratorAction() {
        System.out.println("Administrator-specific action performed.");
        AdminnistratorCityNursing admin = new AdminnistratorCityNursing();
//        navigateTo(admin);
        admin.setVisible(true);

    }
}

}

