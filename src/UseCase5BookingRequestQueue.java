import java.util.Queue;

/**
 * MAIN CLASS - UseCase5BookingRequestQueue
 * =====================================================================
 * Use Case 5: Booking Request (First-Come-First-Served)
 * * @version 5.0
 */
public class UseCase5BookingRequestQueue {
    public static void main(String[] args) {
        // Initialize the Queue manager
        BookingRequestQueue bookingQueueManager = new BookingRequestQueue();

        // Simulating guests submitting requests in order
        bookingQueueManager.addRequest(new Reservation("Alice", "Single Room"));
        bookingQueueManager.addRequest(new Reservation("Bob", "Double Room"));
        bookingQueueManager.addRequest(new Reservation("Charlie", "Suite Room"));

        System.out.println("Booking Request Intake (FIFO Order)\n");
        System.out.println("Current Booking Queue:");

        Queue<Reservation> requests = bookingQueueManager.getRequestQueue();

        // Displaying the requests in the exact order they arrived
        int position = 1;
        for (Reservation res : requests) {
            System.out.println(position + ". " + res);
            position++;
        }

        System.out.println("\nStatus: All requests queued for processing. No inventory updated.");
    }
}