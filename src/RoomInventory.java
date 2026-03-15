import java.util.HashMap;
import java.util.Map;

public class RoomInventory {
    // This is the variable the system "can't find" because it's private
    private Map<String, Integer> roomAvailability;

    public RoomInventory() {
        roomAvailability = new HashMap<>();
        initializeInventory();
    }

    private void initializeInventory() {
        roomAvailability.put("Single Room", 5);
        roomAvailability.put("Double Room", 3);
        roomAvailability.put("Suite Room", 2);
    }

    // YOU MUST ADD THIS METHOD BELOW
    // This is what RoomAllocationService is looking for!
    public Map<String, Integer> getRoomAvailability() {
        return roomAvailability;
    }
}