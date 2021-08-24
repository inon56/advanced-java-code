/*
the components react for two types of mouse events - press and motion
the interface mouseListener contains the methods:
public void mouseReleased(MouseEvent e)
public void mouseClicked(MouseEvent e)
public void mouseEntered(MouseEvent e)
public void mouseExited(MouseEvent e)
public void mousePressed(MouseEvent e)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawingPoints extends JPanel
{
    private int x,y;
    private final int SIZE = 10;

    public DrawingPoints(){
        x = y = -1;
        this.addMouseListener(new Listener()); //the key - this, here is optional and will work even without him
    }

    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.fillOval(x,y,SIZE,SIZE); //for every clickMouse i will get the next coordinate
    }
    // this section without using adapter:
    /*
    private class Listener implements MouseListener{
        @Override
        public void mouseClicked(MouseEvent e){
            x = e.getX();
            y = e.getY();
            repaint(); //this method belongs to JPanel, and its only job is convince the event dispatcher that their was a change
                      // in the screen and the event dispatcher call to paintComponent
        }
                @Override
        public void mouseReleased(MouseEvent e) {
        }
        @Override
        public void mousePressed(MouseEvent e) {
        }
        @Override
        public void mouseExited(MouseEvent e) {
        }
        @Override
        public void mouseEntered(MouseEvent e) {
        }
    }
        */

        /*
        the class MouseAdapter defined in java and implements in an empty way the whole methods.
        we can inherits this class nad thus get the behavior of polymorphism, and
        also give up (לוותר) on implementation of irrelevant methods:
        private class Listener extends MouseAdapter{
        ...
        }
        */
        // using adapter
        private class Listener extends MouseAdapter {
            public void mouseClicked(MouseEvent e) {
                x = e.getX();
                y = e.getY();
                repaint(); //this method belongs to JPanel, and its only job is convince the event dispatcher that their was a change
                // in the screen and the event dispatcher call to paintComponent
            }
        }










}
