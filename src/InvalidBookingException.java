/**
 * CLASS - InvalidBookingException
 * Use Case 9: Error Handling & Validation
 */
public class InvalidBookingException extends Exception {
    /**
     * Creates an exception with a descriptive error message.
     */
    public InvalidBookingException(String message) {
        super(message);
    }
}