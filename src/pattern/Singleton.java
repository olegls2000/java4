package pattern;

public final class Singleton {

    /*public static String var = "FF";
    public String varInst = "FF";*/

    private static Singleton instance;

    public static Singleton getInstance()
    {
        if (instance != null)
        {
            instance = new Singleton();
        }
       return instance;
    }

    public Singleton()
    {

    }
}
