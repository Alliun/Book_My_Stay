/**
 * CLASS - BookingReportService
 * Use Case 8: Booking History & Reporting
 */
public class BookingReportService {

    /**
     * Displays a summary report of all confirmed bookings.
     */
    public void generateReport(BookingHistory history) {
        System.out.println("Booking History Report");

        if (history.getConfirmedReservations().isEmpty()) {
            System.out.println("No confirmed bookings found.");
            return;
        }

        for (Reservation res : history.getConfirmedReservations()) {
            System.out.println("Guest: " + res.getGuestName() + ", Room Type: " + res.getRoomType());
        }
    }
}