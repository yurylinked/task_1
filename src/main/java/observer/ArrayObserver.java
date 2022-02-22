package observer;

import exception.CustomException;

public interface ArrayObserver {
    void updateParametrs(ArrayEvent event) throws CustomException;
}
