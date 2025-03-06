import java.applet.Applet;
import java.awt.Graphics;

public class MyFirstApplet extends Applet {
    public void init() {
        System.out.println("Applet initialized");

    }

    public void start() {
        System.out.println("Applet started");
    }

    public void paint(Graphics g) {
        g.drawString("Welcome to Applet programming Class", 100, 100);
    }

    public void stop() {
        System.out.println("Applet stopped");
        System.out.println("If any one try to stop then alerm will triger");
    }

    public void destroy() {
        System.out.println("Applet destroyed");
    }
}