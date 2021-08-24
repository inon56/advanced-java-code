/*
    draws cross in the mouse pointer position
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class Cross extends JPanel
{
    private int x,y;

    public Cross()
    {
        x = y = 0;
        this.addMouseMotionListener(new MouseMotionAdapter()) // this is called anonymous class
        {
            public void mouseMoved(MouseEvent e)
            {
                x = e.getX();
                y = e.getY();
                repaint();
            }
        }
    }




    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        int h = getHeight();
        int w = getWidth();
        g.drawLine(0,y,w,y);
        g.drawLine(x,0,x,h);
    }

    private class Listener extends MouseMotionAdapter{

    }





}
