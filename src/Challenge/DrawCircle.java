package Challenge;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame {

    public DrawCircle(){
        setTitle("Drawing a Circle");
        setSize(800, 700);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    @Override
    public void paint(Graphics x) {
        Graphics2D x2d = (Graphics2D) x;
        x2d.drawRoundRect(100, 155, 500, 500, 2500, 500);
    }

    public static void main(String[] args) {

        new DrawCircle();

    }
}