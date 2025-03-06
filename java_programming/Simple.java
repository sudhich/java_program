import java.awt.*;
import java.applet.Applet;

public class Simple extends Applet {
    public void paint(Graphics g) {
        g.drawString("A simple Applet", 100, 100);
    }
}
//appletviewer mySimpleApplet.html