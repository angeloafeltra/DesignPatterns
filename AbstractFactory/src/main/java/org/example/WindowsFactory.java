package org.example;

import org.example.widget.button.Button;
import org.example.widget.button.WindowsButton;
import org.example.widget.checkbox.CheckBox;
import org.example.widget.checkbox.WindowsCheckbox;

public class WindowsFactory extends WidgetAbstractFactory {

    public WindowsFactory() {}

    public Button createButton(){
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {

        return new WindowsCheckbox();
    }

}
