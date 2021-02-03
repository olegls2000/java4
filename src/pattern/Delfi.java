package pattern;

public class Delfi implements Subscriber{
    @Override
    public void notifyMe(String forecast) {
        System.out.println("hello delfi,Forecast is: "+forecast);

    }
}
