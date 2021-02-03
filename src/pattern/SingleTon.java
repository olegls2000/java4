package pattern;

public final class SingleTon {
    private static SingleTon instance;

    public static SingleTon getInstance() {
        if (instance == null) {
            instance = new SingleTon();
        }
        return instance;

    }


    private SingleTon() {

    }
}