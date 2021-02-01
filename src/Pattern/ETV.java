package Pattern;

public class ETV implements Subscriber {
    @Override
    public void notifyMe(String forecast)
    {
        System.out.println("Hello from ETV. Forecast is: " + forecast);
    }
}
