package observer.impl;

import entity.CustomArray;
import observer.ArrayEvent;
import observer.ArrayObserver;

public class ArrayArrayObserverImpl implements ArrayObserver {

    @Override
    public void updateParametrs(ArrayEvent event) {
        CustomArray customArray = event.getSource();

    }
}
