/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author user-pc
 */
public class GatorOption {

    public String optionID;
    public String optionText;
    public String nextQuestionID;
    public String optionImage;
    public String response;
    public String barvalue;
    public String pic;
    
    public String toString(){
        String ret = "\n\toptionID: " + optionID;
        ret += "\n\toptionText: " + optionText;
        ret += "\n\tnextQuestionID: " + nextQuestionID;
        ret += "\n\toptionImage: " + optionImage;
        ret += "\n\tresponse: " + response;
        ret +=  "\n\tvalue: " + barvalue;
        return ret;
    }

//    private String id;
//    public void setId(String id){
//        this.id = id;
//    }
//
//    public String getId(){
//        return this.id;
//    }
}
