import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// contains a button and a label, each click increase counter on label
public class CounterPanel extends JPanel
{
    private int counter;
    private JLabel lblCount;
    private JButton cmdPress,cmdMinus;
    private int g  = 2;

    public CounterPanel()
    {
        counter = 0;
        lblCount = new JLabel("pushes: " + counter);
        cmdPress = new JButton("+");
        cmdMinus = new JButton("-");

        ButtonListener lis = new ButtonListener();
        // now we need to tail to the button that the events he is launch - the object ButtonListener hear them
        // so this line is says to cmdPress to where send his
        cmdPress.addActionListener(lis);
        cmdMinus.addActionListener(lis);

        add(lblCount);
        add(cmdPress);
        add(cmdMinus);
    }
    private class ButtonListener implements ActionListener {
        // override the method actionPerformed from ActionListener
        // the object ActionEvent provide us information - for example who's the object that launch the event, or in witch koordinate it happen...
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == cmdPress)
                counter++;
            else if(e.getSource() == cmdMinus)
                counter--;
            lblCount.setText("pushes: " + counter);
        }
    }

}

















