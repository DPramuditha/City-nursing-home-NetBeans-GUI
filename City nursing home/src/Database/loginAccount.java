/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import city.nursing.home.CreateNewAccount;
import Manager.NewAccount;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class loginAccount {
//    public boolean ReadAccountDetails(String filepath, String empId, String username,String password,String typesAccount){
//        NewAccount accountDetails = new NewAccount();
//        
////        employeeId = accountDetails.getEmployeeID();
////        username = accountDetails.getUsername();
////        password = accountDetails.getPassword();
//        
//          try (BufferedReader reader = new BufferedReader(new FileReader("newAccount.txt"))) {
//            String line;
//            String savedEmpID = "";
//            String savedUsername = "";
//            String savedPassword = "";
//            String saveAccountType = "";
//            
//            // Read the file line by line
//            while ((line = reader.readLine()) != null) {
//                // Check for Employee ID in the line
//                if (line.startsWith("Employee ID: ")) {
//                    savedEmpID = line.substring(13).trim();  // Extract the employee ID
//                }
//                // Check for Username in the line
//                else if (line.startsWith("Username: ")) {
//                    savedUsername = line.substring(10).trim();  // Extract the username
//                }
//                // Check for Password in the line
//                else if (line.startsWith("Password: ")) {
//                    savedPassword = line.substring(10).trim();  // Extract the password
//                }
//                else if(line.startsWith("Types Of Account: ")){
//                    saveAccountType = line.substring(17).trim();
//                }
//                
//                // When Employee ID, Username, and Password are all found, check for a match
//                if (!savedEmpID.isEmpty() && !savedUsername.isEmpty() && !savedPassword.isEmpty()) {
//                    // Check if all details match
//                    if (savedEmpID.equals(empId) && savedUsername.equals(username) && savedPassword.equals(password) && saveAccountType.equals(typesAccount)) {
//                        return true;  // Login successful
//                    }
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("Error reading the file: " + e.getMessage());
//        }
//        
//        return false;  // No matching account found, login failed
//    }
    
  public String ReadAccountDetails(String filepath, String empId, String username, String password) {
    try (BufferedReader reader = new BufferedReader(new FileReader("newAccount.txt"))) {
        String line;
        String savedEmpID = "";
        String savedUsername = "";
        String savedPassword = "";
        String savedAccountType = "";

       
        while ((line = reader.readLine()) != null) {
           
            if (line.startsWith("Employee ID: ")) {
                savedEmpID = line.substring("Employee ID: ".length()).trim();
            }
          
            else if (line.startsWith("Username: ")) {
                savedUsername = line.substring("Username: ".length()).trim();
            }
          
            else if (line.startsWith("Password: ")) {
                savedPassword = line.substring("Password: ".length()).trim();
            }
          
            else if (line.startsWith("Types Of Account: ")) {
                savedAccountType = line.substring("Types Of Account: ".length()).trim();
            }

           
            if (!savedEmpID.isEmpty() && !savedUsername.isEmpty() && !savedPassword.isEmpty() && !savedAccountType.isEmpty()) {
                if (savedEmpID.equals(empId) && savedUsername.equals(username) && savedPassword.equals(password)) {
                    return savedAccountType; 
                }
                
                savedEmpID = "";
                savedUsername = "";
                savedPassword = "";
                savedAccountType = "";
            }
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("Error reading the file: " + e.getMessage());
    } catch (Exception e) {
        System.out.println("An unexpected error occurred: " + e.getMessage());
    }

    return null; 
}
}

