import java.util.*;

public class RoomAllocationService {
    // DECLARE the variable here
    private Map<String, Set<String>> assignedRoomsByType;

    public RoomAllocationService() {
        assignedRoomsByType = new HashMap<>(); // Initialize it
        assignedRoomsByType.put("Single Room", new HashSet<>());
        assignedRoomsByType.put("Double Room", new HashSet<>());
        assignedRoomsByType.put("Suite Room", new HashSet<>());
    }

    public void processAllocations(BookingRequestQueue queueManager, RoomInventory inventory) {
        Queue<Reservation> queue = queueManager.getRequestQueue();
        // Ensure this method exists in RoomInventory
        Map<String, Integer> roomCounts = inventory.getRoomAvailability();

        System.out.println("Room Allocation Processing");

        while (!queue.isEmpty()) {
            Reservation request = queue.poll();
            String type = request.getRoomType();
            String fullTypeKey = type + " Room";

            int currentCount = roomCounts.getOrDefault(fullTypeKey, 0);

            if (currentCount > 0) {
                // Now the compiler will FIND "assignedRoomsByType"
                String roomId = type + "-" + (100 + assignedRoomsByType.get(fullTypeKey).size() + 1);

                assignedRoomsByType.get(fullTypeKey).add(roomId);
                roomCounts.put(fullTypeKey, currentCount - 1);

                System.out.println("Booking confirmed for Guest: " + request.getGuestName() + ", Room ID: " + roomId);
            }
        }
    }
}