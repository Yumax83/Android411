package lesson29.DZ29;

public class CheckStringException extends RuntimeException {
    String detail;

    public CheckStringException(String detail, String message) {
        super(message);
        this.detail = detail;
    }

    @Override
    public String toString() {
        return "CheckStringException{" +
                "detail = " + detail +
                ", message = " + getMessage() +
                "}";
    }
}
