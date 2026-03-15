/**
 * MAIN CLASS - UseCase8BookingHistoryReport
 */
public class UseCase8BookingHistoryReport {
    public static void main(String[] args) {
        // Initialize components
        BookingHistory history = new BookingHistory();
        BookingReportService reportService = new BookingReportService();

        // Simulate confirming reservations (Abhi, Subha, Vanmathi)
        // In a full app, these come from the RoomAllocationService
        history.addReservation(new Reservation("Abhi", "Single"));
        history.addReservation(new Reservation("Subha", "Double"));
        history.addReservation(new Reservation("Vanmathi", "Suite"));

        System.out.println("Booking History and Reporting\n");

        // Generate the report
        reportService.generateReport(history);
    }
}