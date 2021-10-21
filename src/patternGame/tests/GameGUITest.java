package patternGame.tests;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import patternGame.GameGUI;

import javax.swing.*;

import static org.junit.Assert.*;

public class GameGUITest {

    @Test
    public void main() {
        JFrame frame = new GameGUI("Pattern game");
        frame.setVisible(true);
        frame.isVisible();
    }
}