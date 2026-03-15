/**
 * CLASS - ReservationValidator
 * Use Case 9: Error Handling & Validation
 */
public class ReservationValidator {
    /**
     * Validates booking input and system state.
     * Throws InvalidBookingException if any check fails.
     */
    public void validate(String guestName, String roomType, RoomInventory inventory)
            throws InvalidBookingException {

        // Check for empty guest name
        if (guestName == null || guestName.trim().isEmpty()) {
            throw new InvalidBookingException("Guest name cannot be empty.");
        }

        // Check for valid room types (Case-Sensitive)
        if (!inventory.getRoomAvailability().containsKey(roomType + " Room")) {
            throw new InvalidBookingException("Invalid room type selected.");
        }

        // Check if rooms are available (Preventing negative inventory)
        if (inventory.getRoomAvailability().get(roomType + " Room") <= 0) {
            throw new InvalidBookingException("No rooms available for the selected type.");
        }
    }
}