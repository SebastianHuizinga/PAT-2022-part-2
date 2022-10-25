/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user-pc
 */
public class UserManager {
    
    private static int currentUserPicNumber;
    
    public static int getUserPicNumber() {
        return currentUserPicNumber;
    }

    public static void setPlayerName(String name){
        try {
            File file = new File("data//login.txt");
            FileWriter filewr = new FileWriter(file);
            try (PrintWriter writer = new PrintWriter(filewr)) {
                writer.println(name);
            }
        } catch (IOException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error");
        }
        
        
    }
      public static String PicChanger(int pictureNumber){
          currentUserPicNumber = pictureNumber;
          File picfile = new File("data//id_cards.txt");
          String pic = "";
        try {
            Scanner scanner = new Scanner(picfile);
            
            while (scanner.hasNextLine() == true ) { 
                    String line = scanner.nextLine();
                    Scanner linesc = new Scanner(line).useDelimiter("#");
               
                int picint = linesc.nextInt();
                if (picint == pictureNumber) {
                    pic = linesc.next();
                }
                linesc.close();
             
           
            }
               scanner.close();
            
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         
          return pic; 
     }
    
}