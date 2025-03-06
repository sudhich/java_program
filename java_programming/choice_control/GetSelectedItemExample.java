import java.applet.Applet;
import java.awt.Choice;
import java.awt.Graphics;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/* <applet code="GetSelectedItemExample" width=200 height=200>
    </applet> */
public class GetSelectedItemExample extends Applet implements ItemListener {
    Choice language = null;

    public void init() {
        // Create choice or combobox
        language = new Choice();

        // Add items to the choice
        language.add("Java");
        language.add("C++");
        language.add("VB");
        language.add("Perl");

        // Add choice or combobox to the applet
        add(language);

        // Add item listener
        language.addItemListener(this);
    }

    public void paint(Graphics g) {
        g.drawString("Selected: " + language.getSelectedItem(), 10, 70);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
}
//javac GetSelectedItemExample.java
//appletviewer GetSelectedItemExample.html