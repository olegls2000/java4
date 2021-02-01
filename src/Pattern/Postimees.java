package Pattern;

public class Postimees implements Subscriber{
    @Override
    public void notifyMe(String forecast)
    {
        System.out.println("Hello from Postimees. Forecast is: " + forecast);
    }
}
