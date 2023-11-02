package org.example;

import org.example.widget.button.Button;
import org.example.widget.checkbox.CheckBox;


public abstract class WidgetAbstractFactory {

    public abstract Button createButton();
    public abstract CheckBox createCheckbox();
}
