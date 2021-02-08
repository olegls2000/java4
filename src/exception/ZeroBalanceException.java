package exception;

public class ZeroBalanceException extends Exception{
    public ZeroBalanceException(String message) {
        super(message);
    }
}