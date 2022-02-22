package observer;

import exception.CustomException;

public interface Observable {
    void attach(ArrayObserver observer);
    void detach(ArrayObserver observer);
    void notifyObservers() throws CustomException;
}
