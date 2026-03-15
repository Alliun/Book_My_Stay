import java.util.LinkedList;
import java.util.Queue;

public class BookingRequestQueue {
    private Queue<Reservation> queue = new LinkedList<>();

    public void addRequest(Reservation res) {
        queue.add(res);
    }

    // FIX: Add this so RoomAllocationService can get the queue
    public Queue<Reservation> getRequestQueue() {
        return this.queue;
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public Reservation poll() {
        return queue.poll();
    }
}