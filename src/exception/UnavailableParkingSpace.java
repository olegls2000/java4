package exception;

public class UnavailableParkingSpace extends Exception {
    public UnavailableParkingSpace(String message) {
        super(message);
    }
}