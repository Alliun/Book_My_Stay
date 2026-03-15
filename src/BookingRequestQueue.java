import java.util.LinkedList;
import java.util.Queue;

/**
 * CLASS - BookingRequestQueue
 * =====================================================================
 * Use Case 5: Booking Request (First-Come-First-Served)
 * * Description:
 * Manages and orders incoming booking requests using a Queue.
 *
 * @version 5.0
 */
public class BookingRequestQueue {
    // Queue to preserve arrival order (FIFO)
    private Queue<Reservation> requestQueue;

    public BookingRequestQueue() {
        this.requestQueue = new LinkedList<>();
    }

    /**
     * Adds a new reservation request to the queue.
     */
    public void addRequest(Reservation reservation) {
        requestQueue.add(reservation);
    }

    /**
     * Returns the current queue of requests.
     */
    public Queue<Reservation> getRequestQueue() {
        return requestQueue;
    }
}