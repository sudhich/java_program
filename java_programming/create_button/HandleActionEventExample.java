import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.*;


public class HandleActionEventExample extends Applet implements ActionListener {
    String actionMessage = "";

    public void init() {
        // Create Buttons
        Button Button1 = new Button("OK");
        Button Button2 = new Button("Cancel");

        // Add Buttons
        add(Button1);
        add(Button2);

        // Set action listeners for buttons
        Button1.addActionListener(this);
        Button2.addActionListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(actionMessage, 10, 50);
    }

    public void actionPerformed(ActionEvent ae) {
        String action = ae.getActionCommand();
        if (action.equals("OK"))
            actionMessage = "OK Button Pressed";
        else if (action.equals("Cancel"))
            actionMessage = "Cancel Button Pressed";
        repaint();
    }
}
//javac HandleActionEventExample.java

//appletviewer HandleActionEventExample.html