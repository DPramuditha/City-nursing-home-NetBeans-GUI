/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;
import Manager.NewAccount;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class DBNewAccount {
    
    public void SaveAccountDetails(NewAccount NewAccount, String filePath){
         try (BufferedWriter writer = new BufferedWriter(new FileWriter("newAccount.txt", true))) {
        writer.append("Employee ID: " + NewAccount.getEmployeeID() + "\n" +"Username: " + NewAccount.getUsername()+"\n" +"Password: " + NewAccount.getPassword() 
        + "\n" + "Types Of Account: " + NewAccount.getTypesOfAccount());
        writer.newLine();
        writer.append("==========================================================");
        writer.newLine();
        System.out.println("Successfully Register A New Account...");
    } catch (Exception e) {
        System.out.println(e);
    }
}
}
