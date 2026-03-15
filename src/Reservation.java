/**
 * CLASS - Reservation
 * =====================================================================
 * Use Case 5: Booking Request (First-Come-First-Served)
 * * Description:
 * This class represents a guest's intent to book a room.
 * It encapsulates request details before processing.
 *
 * @version 5.0
 */
public class Reservation {
    private String guestName;
    private String roomType;

    public Reservation(String guestName, String roomType) {
        this.guestName = guestName;
        this.roomType = roomType;
    }

    public String getGuestName() { return guestName; }
    public String getRoomType() { return roomType; }

    @Override
    public String toString() {
        return "Guest: " + guestName + " | Room Type: " + roomType;
    }
}