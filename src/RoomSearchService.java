import java.util.Map;

/**
 * CLASS - RoomSearchService
 * =====================================================================
 * Use Case 4: Room Search & Availability Check
 *
 * Description:
 * This class provides read-only access to view available rooms.
 * It ensures inventory state is not modified during search.
 *
 * @version 4.0
 */
public class RoomSearchService {

    /**
     * Displays available rooms along with their details and pricing.
     * Performs read-only access to inventory and room data.
     */
    public void searchAvailableRooms(
            RoomInventory inventory,
            Room singleRoom,
            Room doubleRoom,
            Room suiteRoom) {

        Map<String, Integer> availability = inventory.getRoomAvailability();

        System.out.println("Room Search Results:\n");

        // Check and display Single Room availability
        if (availability.getOrDefault("Single Room", 0) > 0) {
            displayRoom(singleRoom, "Single Room", availability.get("Single Room"));
        }

        // Check and display Double Room availability
        if (availability.getOrDefault("Double Room", 0) > 0) {
            displayRoom(doubleRoom, "Double Room", availability.get("Double Room"));
        }

        // Check and display Suite Room availability
        if (availability.getOrDefault("Suite Room", 0) > 0) {
            displayRoom(suiteRoom, "Suite Room", availability.get("Suite Room"));
        }
    }

    private void displayRoom(Room room, String type, int count) {
        System.out.println(type + ":");
        System.out.println("Beds: " + room.numberOfBeds);
        System.out.println("Size: " + room.squareFeet + " sqft");
        System.out.println("Price per night: " + room.pricePerNight);
        System.out.println("Available: " + count + "\n");
    }
}