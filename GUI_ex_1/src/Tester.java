import javax.swing.*;
import java.awt.*;


public class Tester extends JPanel
{
    public static void main(String[] args) {



        JFrame frame = new JFrame("tester");
        frame.setVisible(true); // the default is false so it need to be true in order to be displayed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // what will happen when we press the X on the window
        frame.setSize(500,500); // size in pixels, the default is size 0
        /* this section for MyPanel
        MyPanel p = new MyPanel(); // MyPanel inherits JPanel and JPanel inherits JComponent
        frame.add(p); //the signature of add don't get an JPanel as param, its get a JComponent (JPanel inherits JComponent thus its okay to write instead an object of JPanel
        */

        /* this section for HelloPanel
        HelloPanel p = new HelloPanel();
        frame.add(p);
        */

        CounterPanel c = new CounterPanel();
        frame.add(c);






    }
}
