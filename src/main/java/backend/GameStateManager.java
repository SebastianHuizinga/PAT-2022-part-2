/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import backend.GameMethods;
import backend.UserManager;

/**
 *
 * @author user-pc
 */
public class GameStateManager {
    
    private static UserManager userManager;
    private static GameMethods gameMethods;
    //makes new usermanager if doesnt exist
    public static UserManager getUserManager(){ 
        if(userManager == null){
            userManager = new UserManager();
        }
        return userManager;
    }
      //makes new gamethod if doesnt exist
    public static GameMethods getGameMethods(){ 
        if(gameMethods == null){
            gameMethods = new GameMethods();
        }
        return gameMethods; 
    }
      //restart function
    public static void Recycle(){
        userManager = null;
        gameMethods = null;
    }
    
}
