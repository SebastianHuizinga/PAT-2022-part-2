/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/**
 *
 * @author user-pc
 */
public class ChatManager {

    public Map<String, GatorQuestion> questions;
    public Map<String, GatorOption> options;


    public ChatManager() {
        //creates json parser
        JSONParser jsonParser = new JSONParser();
        String jsonPath = "src/main/assets/json/gatorprompts.json";
        
        
        

        //make new json reader
        try {
            FileReader reader = new FileReader(jsonPath);
            //gets return of parsing which is an object
            JSONArray arr = (JSONArray) jsonParser.parse(reader);

            //creates a hashmap (code dictionary) thats key is String and value is Question (custom data type)
            questions = new HashMap<String, GatorQuestion>();
            //options = new HashMap<String, GatorOption>();

            //goes thru all code via finding length and looping for said length
            for (int i = 0; i < arr.size(); i++) {

                //makes a Question type variable name qParse that corresponds with current i position
                GatorQuestion question = getGatorQuestion((JSONObject) arr.get(i));
                //GatorOption option = getGatorOption((JSONObject) arr.get(i));
                //Puts into hasmap
                questions.put(question.questionID, question);
                //options.put(option.optionID, option);
            }
            
            
         
        } catch (Exception e) {
            e.printStackTrace();
        }

        
    }

    //Question is a custom data type created
    private GatorQuestion getGatorQuestion(JSONObject jOb) {

        //creates json object that draws from json file under question (object)
        JSONObject questionObj = (JSONObject) jOb.get("question");

        //assigning values for ID and actual text of questions
        GatorQuestion gatorQuestion = new GatorQuestion();
        gatorQuestion.questionID = (String) (questionObj.get("questionID"));
        gatorQuestion.questionText = (String) (questionObj.get("questionText"));
        gatorQuestion.questionImage = (String)(questionObj.get("questionImage"));
        gatorQuestion.puzzleGame = (String)(questionObj.get("puzzle"));
        gatorQuestion.birdGame = (String)(questionObj.get("birds"));
        
        //array used for options
        JSONArray optionArray = (JSONArray) questionObj.get("options");
        gatorQuestion.options = new GatorOption[optionArray.size()];
        for (int i = 0; i < optionArray.size(); i++) {
            GatorOption option = getGatorOption((JSONObject) optionArray.get(i));
            gatorQuestion.options[i] = option;
        }

        return gatorQuestion;

    }

    //method for parsing them options [:
    public GatorOption getGatorOption(JSONObject optObj) {
        JSONObject jsonOptionObject = (JSONObject) optObj.get("option");
        GatorOption gatorOption = new GatorOption();
        gatorOption.optionID = (String) jsonOptionObject.get("optionID");
        gatorOption.optionImage = (String) jsonOptionObject.get("optionImage");
        gatorOption.nextQuestionID = (String) jsonOptionObject.get("nextQuestionID");
        gatorOption.optionText = (String) jsonOptionObject.get("optionText");
        gatorOption.response = (String) jsonOptionObject.get("response");
        gatorOption.barvalue = (String) jsonOptionObject.get("barvalue");
        gatorOption.pic = (String) jsonOptionObject.get("pic");
        
        return gatorOption;
    }

}
