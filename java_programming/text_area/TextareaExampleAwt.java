import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <APPLET CODE="TextareaExampleAwt.class" WIDTH=300 HEIGHT=200> </APPLET> */
public class TextareaExampleAwt extends Applet implements ActionListener {
    String t;
    Button b1, b2;
    TextArea txt;

    public void init() {
        txt = new TextArea("Welcome to Java", 2, 30);
        b1 = new Button("Upper Case");
        b2 = new Button("Lower Case");

        add(txt);
        add(b1);
        add(b2);

        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent event) {
        String k = event.getActionCommand();
        if (k.equals("Upper Case")) {
            t = txt.getText();
            txt.setText(t.toUpperCase());
        }
        if (k.equals("Lower Case")) {
            t = txt.getText();
            txt.setText(t.toLowerCase());
        }
    }
}
//javac TextareaExampleAwt.java
//appletviewer TextareaExampleAwt.html