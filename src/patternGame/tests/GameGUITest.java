package patternGame.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import patternGame.GameGUI;

import javax.swing.*;

import static org.junit.Assert.*;

public class GameGUITest {

    ImageIcon first = new ImageIcon("src/patternGame/patterns/AbstractFactory.jpg");
    ImageIcon second = new ImageIcon("src/patternGame/patterns/Builder.jpg");
    ImageIcon third = new ImageIcon("src/patternGame/patterns/Decorator.jpg");
    private JLabel RequestToUser;

    @Before
    public void setUp() throws Exception{
        RequestToUser = new JLabel();
        RequestToUser.setIcon(first);
    }

    @Test
    public void main() {
        JFrame frame = new GameGUI("Pattern game");
        frame.setVisible(true);
        frame.isVisible();
        frame.isEnabled();
    }

    @Test
    public void randomizerForPicture(){
        int picture = (int) (Math.random() * 3);
        if(picture == 1){
            RequestToUser.setIcon(first);
            Assert.assertEquals(first, RequestToUser.getIcon());
        } else if(picture == 2){
            RequestToUser.setIcon(second);
            Assert.assertEquals(second, RequestToUser.getIcon());
        }
        RequestToUser.setIcon(third);
        Assert.assertEquals(third, RequestToUser.getIcon());
    }
}