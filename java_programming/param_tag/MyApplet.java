import java.applet.Applet;
import java.awt.Graphics;

public class MyApplet extends Applet {
    String n;
    String a;

    public void init() {
        n = getParameter("name");
        a = getParameter("age");
    }

    public void paint(Graphics g) {
        g.drawString("Name is: " + n, 20, 20);
        g.drawString("Age is: " + a, 20, 40);
    }
}