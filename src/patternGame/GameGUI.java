package patternGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameGUI extends JFrame{

    private String patternName1 = "AbstractFactory";
    private String patternName2 = "Builder";
    private String patternName3 = "Decorator";
    String pictureName;

    ImageIcon first = new ImageIcon("src/patternGame/patterns/AbstractFactory.jpg");
    ImageIcon second = new ImageIcon("src/patternGame/patterns/Builder.jpg");
    ImageIcon third = new ImageIcon("src/patternGame/patterns/Decorator.jpg");

    private JPanel MainPanel;
    private JPanel QuestionPanel;
    private JLabel patternPicture;
    private JLabel RequestToUser;
    private JRadioButton abstractFactoryRadioButton;
    private JRadioButton builderRadioButton;
    private JRadioButton decoratorRadioButton;
    private JButton sendAnswerButton;


    public GameGUI(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
        randomizerForPicture();
        this.pack();
    }

    public JLabel randomizerForPicture(){
        int picture = (int) (Math.random() * 3);
        if(picture == 1){
            pictureName = patternName1;
            RequestToUser.setIcon(first);
            return RequestToUser;
        } else if(picture == 2){
            pictureName = patternName2;
            RequestToUser.setIcon(second);
            return RequestToUser;
        }
        pictureName = patternName3;
        RequestToUser.setIcon(third);
        return RequestToUser;
    }

    public static void main(String[] args){
        JFrame frame = new GameGUI("Pattern game");
        frame.setVisible(true);
    }

}
