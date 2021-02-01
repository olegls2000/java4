package pattern;

public class Postimees implements Subscriber {
    @Override
    public void notifyMe(String forecast) {
        System.out.println("Next Day forecast is: " + forecast);
    }
}
