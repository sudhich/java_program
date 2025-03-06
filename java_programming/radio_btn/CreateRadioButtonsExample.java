import java.applet.Applet;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;

/* <applet code="CreateRadioButtonsExample" width=200 height=200>
    </applet> */
public class CreateRadioButtonsExample extends Applet {
    public void init() {
        CheckboxGroup langGroup = new CheckboxGroup();

        Checkbox java = new Checkbox("Java", langGroup, true);
        Checkbox cpp = new Checkbox("C++", langGroup, false);
        Checkbox vb = new Checkbox("VB", langGroup, false);

        // Add radio buttons to the applet
        add(java);
        add(cpp);
        add(vb);
    }
}
//javac CreateRadioButtonsExample.java
//appletviewer CreateRadioButtonsExample.html