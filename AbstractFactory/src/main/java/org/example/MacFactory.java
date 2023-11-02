package org.example;

import org.example.widget.button.Button;
import org.example.widget.button.MacButton;
import org.example.widget.checkbox.MacCheckbox;
import org.example.widget.checkbox.CheckBox;


public class MacFactory extends WidgetAbstractFactory {

    public MacFactory() {}

    public Button createButton(){
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckbox();
    }


}
