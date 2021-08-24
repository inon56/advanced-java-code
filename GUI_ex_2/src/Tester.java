import javax.swing.*;
import java.awt.*;

public class Tester extends JPanel
{
    public static void main(String[] args)
    {
        JFrame frame = new JFrame("tester");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500); // size in pixels, the default is size 0
        DrawingPoints draw = new DrawingPoints();
        frame.add(draw);
    }

}
