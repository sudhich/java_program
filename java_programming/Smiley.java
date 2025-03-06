import java.awt.*;
import java.applet.*;

public class Smiley extends Applet {
    // Initialize the applet
    public void init() {
        setBackground(Color.blue);
    }

    // Draw the human face
    public void paint(Graphics g) {
        Font f = new Font("Helvetica", Font.BOLD, 20);
        g.setFont(f);
        g.drawString("Keep Smiling!!", 50, 30);

        // Change color to cream
        Color cream = new Color(255, 173, 86);
        g.setColor(cream);

        // Draw and fill the main face
        g.drawOval(30, 50, 200, 200); // Main Face
        g.fillOval(30, 50, 200, 200); // Main Face

        // Draw and fill the left eye brow and eye
        g.setColor(Color.black);
        g.drawArc(52, 60, 30, 20, 0, 180); // Left Eye Brow
        g.fillOval(58, 65, 25, 25); // Left Eye

        // Draw and fill the right eye brow and eye
        g.drawArc(152, 80, 30, 30, 0, 180); // Right Eye Brow
        
        g.fillOval(158, 65, 25, 25); // Right Eye

        // Draw and fill the mouth
        g.setColor(Color.red);
        g.drawArc(90, 190, 60, 20, 0, -180); // Mouth
        g.fillArc(90, 190, 60, 20, 0, -180); // Mouth

        // Draw the nose
        g.setColor(Color.black);
        g.drawLine(130, 135, 115, 160); // Nose Left Line
        g.drawLine(130, 135, 145, 160); // Nose Right Line
        g.drawLine(115, 160, 145, 160); // Nose Base
    }
}