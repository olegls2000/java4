package pattern;

public class Etv  implements Subscriber{
    @Override
    public void notifyMe(String forecast) {
        System.out.println("Tere! Ilm on: " + forecast);
    }
}
