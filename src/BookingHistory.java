import java.util.ArrayList;
import java.util.List;

/**
 * CLASS - BookingHistory
 * Use Case 8: Booking History & Reporting
 */
public class BookingHistory {
    // List that stores confirmed reservations in chronological order
    private List<Reservation> confirmedReservations;

    public BookingHistory() {
        confirmedReservations = new ArrayList<>();
    }

    /**
     * Adds a confirmed reservation to the audit trail.
     */
    public void addReservation(Reservation reservation) {
        confirmedReservations.add(reservation);
    }

    /**
     * Returns all stored reservations for reporting.
     */
    public List<Reservation> getConfirmedReservations() {
        return confirmedReservations;
    }
}