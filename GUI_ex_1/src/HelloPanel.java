//A simple panel that contains a label and two buttons
import javax.swing.*;

public class HelloPanel extends JPanel
{
    private JLabel lblHello;
    public JButton cmdOK,cmdCanel;

    public HelloPanel()
    {
        lblHello = new JLabel("Hello");
        cmdOK = new JButton("OK");
        cmdCanel = new JButton("Cancel");
        add(lblHello); //add comes from JPanel, thus its equivalent to write  super.add
        // all the graphics component inherits from abstract class JComponent
        add(cmdOK);
        add(cmdCanel);

    }


}
