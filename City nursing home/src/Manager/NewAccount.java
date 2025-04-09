/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Manager;
import city.nursing.home.CreateNewAccount;

public class NewAccount {
    private String employeeID;
    private String username;
    private String password;
    private String typesOfAccount;
    
    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

   
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

   
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public String getTypesOfAccount(){
        return typesOfAccount;
    }
    public void setTypesOfAccount(String typesOfAccount){
        this.typesOfAccount = typesOfAccount;
    }
    
}
