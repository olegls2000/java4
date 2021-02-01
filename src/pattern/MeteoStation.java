package pattern;

import java.util.ArrayList;

public class MeteoStation {

    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber newSubscriber) {
        subscribers.add(newSubscriber);
    }

    public void removeSubscriber(Subscriber subscriberToRemove) {
        subscribers.remove(subscriberToRemove);
    }

    public void publishForecast(String forecast) {
        System.out.println("New: ------------------------------------------------");

        for (Subscriber subscriber : subscribers) {
            subscriber.notifyMe(forecast);
        }
    }
}
