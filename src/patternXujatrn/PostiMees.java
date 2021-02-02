package pattern;

public class PostiMees implements Subscriber{

    @Override
    public void notifyMe(String forecast) {
        System.out.println("Postimees is "+forecast);
    }
}
