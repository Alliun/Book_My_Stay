import java.util.Map;
import java.util.Queue;

public class RoomAllocationService {

    // Existing method for bulk processing
    public void processAllocations(BookingRequestQueue queueManager, RoomInventory inventory) {
        Queue<Reservation> queue = queueManager.getRequestQueue();
        while (!queue.isEmpty()) {
            allocateRoom(queue.poll(), inventory);
        }
    }

    // FIX: Add/Ensure this method exists for the Multi-threaded Use Case 11
    public void allocateRoom(Reservation request, RoomInventory inventory) {
        if (request == null) return;

        String type = request.getRoomType();
        String fullTypeKey = type + " Room";
        Map<String, Integer> availability = inventory.getRoomAvailability();

        if (availability.getOrDefault(fullTypeKey, 0) > 0) {
            availability.put(fullTypeKey, availability.get(fullTypeKey) - 1);
            System.out.println("Booking confirmed for Guest: " + request.getGuestName() +
                    ", Room ID: " + type + "-1"); // Simplified ID for demo
        } else {
            System.out.println("Booking failed for Guest: " + request.getGuestName() +
                    " (No " + type + " rooms left)");
        }
    }
}