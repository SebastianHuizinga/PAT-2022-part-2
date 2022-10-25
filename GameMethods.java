/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;


import backend.GatorQuestion;
import backend.ChatManager;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Color;
import backend.GatorOption;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

/**
 *
 * @author sebastianh
 */
public class GameMethods {

    private ChatManager chatManager;
    private GatorQuestion currentQuestion;
    private GatorOption currentOption;
    private boolean hasResponded;
    private static int barvalue;

 

    public void End(int barval, JLabel label) {
        if (barval < 100) {
            ImageIcon screen = new ImageIcon("src//main//resources//images//endLoss.png");
            label.setIcon(screen);
        } else if (barval >= 100) {
            ImageIcon screen = new ImageIcon("src//main//resources//images//Gator win.png");
            label.setIcon(screen);
          
        }

    }

    public void getVacationPicture(int value, JLabel label, JLabel piclabel) {
        File picfile = new File("data//id_cards.txt");
        String picUrl = "";
        try {
            Scanner scanner = new Scanner(picfile);

            while (scanner.hasNextLine() == true) {
                String line = scanner.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                int picint = linesc.nextInt();
                if (picint == value) {
                    picUrl = linesc.next();
                    ImageIcon picture = new ImageIcon(picUrl);
                    piclabel.setIcon(picture);
                }
                linesc.close();
            }
            scanner.close();

            File namefile = new File("data//login.txt");
            String name = "";
            Scanner scanner2 = new Scanner(namefile);
            String line = scanner2.nextLine();
            Scanner linesc2 = new Scanner(line).useDelimiter("#");

            name = linesc2.next();
            label.setText("ON A HOLI-DATE WITH " + name);
            linesc2.close();
            scanner2.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void getEndPicture(int value, JLabel label, JLabel piclabel) {
        File picfile = new File("data//id_cards.txt");
        String picUrl = "";
        try {
                Scanner scanner = new Scanner(picfile);

            while (scanner.hasNextLine() == true) {
                String line = scanner.nextLine();
                Scanner linesc = new Scanner(line).useDelimiter("#");
                int picint = linesc.nextInt();
                if (picint == value) {
                    picUrl = linesc.next();
                    ImageIcon picture = new ImageIcon(picUrl);
                    piclabel.setIcon(picture);
                }
                linesc.close();
            }
            scanner.close();

            File namefile = new File("data//login.txt");
            String name = "";
            Scanner scanner2 = new Scanner(namefile);
            String line = scanner2.nextLine();
            Scanner linesc2 = new Scanner(line).useDelimiter("#");

            name = linesc2.next();
            label.setText("Thanks for playing! " + name);
            linesc2.close();
            scanner2.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(UserManager.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void setQuestionForId(String questionId, JTextArea dialogue_area, JButton button1, JButton button2) {
        currentQuestion = chatManager.questions.get(questionId);
        if (currentQuestion != null) {
            dialogue_area.setText(currentQuestion.questionText);
            button1.setText(currentQuestion.options[0].optionText);
            button2.setText(currentQuestion.options[1].optionText);
            System.out.println(currentQuestion);
        }

    }
}
