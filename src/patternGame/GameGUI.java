package patternGame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class GameGUI extends JFrame{

    private String patternName1 = "AbstractFactory";
    private String patternName2 = "Builder";
    private String patternName3 = "Decorator";
    String pictureName;

    ImageIcon first = new ImageIcon("src/patternGame/patterns/AbstractFactory.jpg");
    ImageIcon second = new ImageIcon("src/patternGame/patterns/Builder.jpg");
    ImageIcon third = new ImageIcon("src/patternGame/patterns/Decorator.jpg");

    private JPanel MainPanel;
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
        sendAnswerButton.addActionListener(new ButtonEventListener());
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

    class ButtonEventListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String message = "";
            if(pictureName.equals(patternName1)){
                if(abstractFactoryRadioButton.isSelected()) {
                    message += "You have been given the correct answer\n";
                } else {
                    message += "You have been given incorrect answer\n";
                }
            } else if(pictureName.equals(patternName2)){
                if(builderRadioButton.isSelected()) {
                    message += "You have been given the correct answer\n";
                } else {
                    message += "You have been given incorrect answer\n";
                }
            } else if(pictureName.equals(patternName3)){
                if(decoratorRadioButton.isSelected()) {
                    message += "You have been given the correct answer\n";
                } else {
                    message += "You have been given incorrect answer\n";
                }
            }
            JOptionPane.showMessageDialog(GameGUI.this,
                    message);
            try {
                TimeUnit.SECONDS.sleep(5);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            randomizerForPicture();
            revalidate();
            repaint();
        }
    }

    public static void main(String[] args){
        JFrame frame = new GameGUI("Pattern game");
        frame.setVisible(true);
    }
}
