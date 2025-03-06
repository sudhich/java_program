import java.applet.Applet;
import java.awt.Graphics;
import java.awt.List;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/* <applet code="GetSelectedItemFromMultiSelectExample" width=200 height=200>
    </applet> */
public class GetSelectedItemFromMultiSelectExample extends Applet implements ItemListener {
    List list = null;

    public void init() {
        // Create a multi-select list
        list = new List(5, true);

        // Add items to the list
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");

        // Add list to the applet
        add(list);

        // Add item listener
        list.addItemListener(this);
    }

    public void paint(Graphics g) {
        String[] items = list.getSelectedItems();
        String msg = "";
        for (int i = 0; i < items.length; i++) {
            msg += items[i] + " ";
        }
        g.drawString("Selected Items: " + msg, 10, 120);
    }

    public void itemStateChanged(ItemEvent ie) {
        repaint();
    }
}
//javac GetSelectedItemFromMultiSelectExample.java
//appletviewer GetSelectedItemFromMultiSelectExample.html