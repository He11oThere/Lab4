package exceptions;

public class NotEnoughShorties extends RuntimeException {
    public NotEnoughShorties(String message) {
        super(message);
    }
}
