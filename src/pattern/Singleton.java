package pattern;

public final class Singleton {
    //    public static Str
    //    ing var = "FF";
    //    public String varInst = "FF";
    private static Singleton instance;

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton() {
    }


}