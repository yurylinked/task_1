package observer;

import entity.CustomArray;

import java.util.EventObject;

public class ArrayEvent extends EventObject {

    public CustomArray getSource() {
        return (CustomArray) super.getSource();
    }

    public ArrayEvent(Object source) {
        super(source);
    }
}
