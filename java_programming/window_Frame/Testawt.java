import java.awt.*;
/*
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
*/
//javac Testawt.java
//java Testawt

import java.awt.*;
import java.awt.event.*;

public class Testawt extends Frame {

    public Testawt() {
        Button btn = new Button("Hello World");
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
