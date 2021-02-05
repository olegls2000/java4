package exception;

public class ZeroBalance extends Exception{
    public ZeroBalance(String message) {
        super(message);
    }
}