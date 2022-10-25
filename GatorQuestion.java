/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author user-pc
 */
public class GatorQuestion {

    public String questionText;
    public String questionID;
    public GatorOption[] options;
    public String image;
    public String questionImage;
    public String birdGame;
    public String puzzleGame;
 
    
    public String toString(){
        String ret = "\n--------------------------";
        ret += "\nquestionText: " + questionText;
        ret += "\nquestionID: " + questionID;
        ret += "\noptions[]: " + questionID;
        for(int i=0; i<options.length; i++) {
            ret += options[i].toString();
        }
        return ret;
    }
}
