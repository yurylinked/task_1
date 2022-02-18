package util;

public class CustomGeneratorId {
    private static CustomGeneratorId instance;
    private static long id;

    private CustomGeneratorId() {
    }

    public static CustomGeneratorId getInstance() {
        if (instance == null) {
            instance = new CustomGeneratorId();
        }
        return instance;

    }

    public long getId() {
      return ++id;
    }

}
