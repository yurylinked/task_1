package util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomGeneratorIdTest {

    @Test
    void getInstance() {
    }

    @Test
    void getId() {
        CustomGeneratorId instance = CustomGeneratorId.getInstance();
        System.out.println(instance.getId());
    }
}