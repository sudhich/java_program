import java.awt.*;

public class Testawt {
    Testawt() {
        Frame fm = new Frame(); // Creating a frame
        Label lb = new Label("Welcome to java graphics"); // Creating a label
        fm.add(lb); // Adding label to the frame
        fm.setSize(300, 300); // Setting frame size
        fm.setVisible(true); // Set frame visibility true
    }

    public static void main(String args[]) {
        Testawt ta = new Testawt();
    }
}
//javac Testawt.java
//java Testawt