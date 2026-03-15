import java.util.HashMap;
import java.util.Map;

/**
 * CLASS - RoomInventory
 * =====================================================================
 * Use Case 3: Centralized Room Inventory Management
 * * @version 3.0
 */
public class RoomInventory {

    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        // Mapping room names (Keys) to counts (Values)
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }
}