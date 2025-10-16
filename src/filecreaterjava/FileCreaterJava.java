/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package filecreaterjava;

import java.io.File;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author maxwe
 */
public class FileCreaterJava {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //GUI for adding file path
        String newFile = JOptionPane.showInputDialog(null, "Where would you like to store the file (Enter Path)");
        
        File file = new File(newFile);
        
        try{
            if(file.createNewFile()){
                JOptionPane.showMessageDialog(null, "File succesfully created");
            }else{
                JOptionPane.showMessageDialog(null, "File already exits");
                
            }
        }catch(IOException e){
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
        
        System.out.println(newFile);
    }
    
    
}
