package Pattern;

import java.util.ArrayList;

public class MeteoStation {
    private ArrayList<Subscriber> subscribers = new ArrayList<>();

    public void addSubscriber(Subscriber newSubscriber)
    {
        subscribers.add(newSubscriber);
    }

    public void removeSubscriber(Subscriber existingSubscriber)
    {
        subscribers.remove(existingSubscriber);
    }

    public void publishForecast(String forecast)
    {
        System.out.println("NEW-----------------------------------");
        for (Subscriber subscriber : subscribers)
        {
            subscriber.notifyMe(forecast);
        }
    }

}
