package org.example;

import org.example.widget.button.Button;
import org.example.widget.checkbox.CheckBox;

public class Main {
    public static void main(String[] args) {

        WidgetAbstractFactory factory=null;
        Button button;
        CheckBox checkBox;

        if(System.getProperty("os.name").contains("Mac")){
            factory=new MacFactory();
        }

        if(System.getProperty("os.name").contains("Windows")){
            factory=new WindowsFactory();
        }

        checkBox=factory.createCheckbox();
        checkBox.print();
        button=factory.createButton();
        button.print();
        
    }
}


