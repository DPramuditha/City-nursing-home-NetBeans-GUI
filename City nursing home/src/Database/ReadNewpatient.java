/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JOptionPane;


public class ReadNewpatient {
        public String readNewPatient(String filepath){
               StringBuilder content = new StringBuilder();    
       try (BufferedReader reader = new BufferedReader(new FileReader("newPatient.txt"))) {
//            StringBuilder content = new StringBuilder();
            String line;
            String lastLine = "";
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
                System.out.println(line);
//                lastLine = line;
            }
//            jTextArea1.setText(content.toString());
////            jTextArea1.setText(lastLine);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error reading file: " + e.getMessage());
            System.out.println(e);
        } 
       return content.toString();
    }
}
