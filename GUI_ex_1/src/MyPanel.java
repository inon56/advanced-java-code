import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel {
    public void paintComponent(Graphics g){
        super.paintComponent(g); //this clean the screen
        g.setColor(Color.RED); //default is black
        g.drawRect(50,50,100,70);
        g.setColor(Color.GREEN);
        g.fillOval(170,80,150,180); //oval shape and its full

        Color c = new Color(100,50,150,120);
        g.setColor(c);
        g.fillRect(100,20,120,250); // the rect will hide the other shapes because it was create afterwards thus its on them

        int w = getWidth(); //getWidth belongs to JPanel
        int h = getHeight(); //getHeight belongs to JPanel
        g.setColor(Color.BLACK);
        g.fillRect(w/2 - 25,h/2 - 25,50,50);

        g.drawLine(w/2,0,w/2,h); //line at the middle of screen

    }
}
