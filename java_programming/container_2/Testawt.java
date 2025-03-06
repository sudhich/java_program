import java.awt.*;
import java.awt.event.*;

public class Testawt extends Frame {

    public Testawt() {
        Button btn = new Button("Submit");
        add(btn);
        setSize(400, 500); // Setting size
        setTitle("Frame Window"); // Setting title
        setLayout(new FlowLayout()); // Set default layout for frame
        setVisible(true); // Set frame visibility true
    }

    public static void main(String[] args) {
        Testawt ta = new Testawt(); // Creating a frame
    }
}