package exception;

public class UnavailableParkingSpaceException extends Exception {
    public UnavailableParkingSpaceException(String message) {
        super(message);
    }
}