import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    Label lb1, lb2, lb3;
    TextField tx1, tx2, tx3;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7;

    public Calculator() {
        lb1 = new Label("Var 1");
        lb2 = new Label("Var 2");
        lb3 = new Label("Result");
        tx1 = new TextField(10);
        tx2 = new TextField(10);
        tx3 = new TextField(10);
        btn1 = new Button("Add");
        btn2 = new Button("Sub");
        btn3 = new Button("Multi");
        btn4 = new Button("Div");
        btn5 = new Button("Mod");
        btn6 = new Button("Reset");
        btn7 = new Button("Close");

        add(lb1);
        add(tx1);
        add(lb2);
        add(tx2);
        add(lb3);
        add(tx3);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btn7);

        setSize(200, 200);
        setTitle("Calculator");
        setLayout(new FlowLayout());

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        double a = 0, b = 0, c = 0;
        try {
            a = Double.parseDouble(tx1.getText());
        } catch (NumberFormatException e) {
            tx1.setText("Invalid input");
        }
        try {
            b = Double.parseDouble(tx2.getText());
        } catch (NumberFormatException e) {
            tx2.setText("Invalid input");
        }

        if (ae.getSource() == btn1) {
            c = a + b;
            tx3.setText(String.valueOf(c));
        }
        if (ae.getSource() == btn2) {
            c = a - b;
            tx3.setText(String.valueOf(c));
        }
        if (ae.getSource() == btn3) {
            c = a * b;
            tx3.setText(String.valueOf(c));
        }
        if (ae.getSource() == btn4) {
            c = a / b;
            tx3.setText(String.valueOf(c));
        }
        if (ae.getSource() == btn5) {
            c = a % b;
            tx3.setText(String.valueOf(c));
        }
        if (ae.getSource() == btn6) {
            tx1.setText("0");
            tx2.setText("0");
            tx3.setText("0");
        }
        if (ae.getSource() == btn7) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setVisible(true);
        calc.setLocation(300, 300);
    }
}