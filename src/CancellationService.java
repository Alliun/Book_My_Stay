import java.util.*;

/**
 * CLASS - CancellationService
 * Use Case 10: Booking Cancellation & Inventory Rollback
 */
public class CancellationService {
    // Stack to track recently released room IDs (LIFO)
    private Stack<String> releasedRoomIds;
    // Map to link Reservation ID to the Room Type for restoration
    private Map<String, String> reservationRoomTypeMap;

    public CancellationService() {
        releasedRoomIds = new Stack<>();
        reservationRoomTypeMap = new HashMap<>();
    }

    /**
     * Registers a booking so it can be cancelled later.
     */
    public void registerBooking(String reservationId, String roomType) {
        reservationRoomTypeMap.put(reservationId, roomType);
    }

    /**
     * Cancels a booking and restores inventory.
     */
    public void cancelBooking(String reservationId, String allocatedRoomId, RoomInventory inventory) {
        if (reservationRoomTypeMap.containsKey(reservationId)) {
            String roomType = reservationRoomTypeMap.get(reservationId);
            String fullTypeKey = roomType + " Room";

            // 1. Restore Inventory
            int currentCount = inventory.getRoomAvailability().getOrDefault(fullTypeKey, 0);
            inventory.getRoomAvailability().put(fullTypeKey, currentCount + 1);

            // 2. Track Rollback in Stack
            releasedRoomIds.push(allocatedRoomId);

            System.out.println("Booking cancelled successfully. Inventory restored for room type: " + roomType);
            reservationRoomTypeMap.remove(reservationId);
        } else {
            System.out.println("Cancellation failed: Invalid Reservation ID.");
        }
    }

    /**
     * Displays recently cancelled reservations (Rollback History).
     */
    public void showRollbackHistory() {
        System.out.println("\nRollback History (Most Recent First):");
        if (releasedRoomIds.isEmpty()) {
            System.out.println("No rollback history found.");
            return;
        }

        // Stacks naturally iterate LIFO
        for (String roomId : releasedRoomIds) {
            System.out.println("Released Reservation ID: " + roomId);
        }
    }
}