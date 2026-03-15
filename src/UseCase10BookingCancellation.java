/**
 * MAIN CLASS - UseCase10BookingCancellation
 */
public class UseCase10BookingCancellation {
    public static void main(String[] args) {
        System.out.println("Booking Cancellation");

        // Initialize components
        RoomInventory inventory = new RoomInventory();
        CancellationService cancellationService = new CancellationService();

        // 1. Simulate an existing booking
        String resId = "Single-1";
        String roomType = "Single";
        cancellationService.registerBooking(resId, roomType);

        // 2. Perform Cancellation
        cancellationService.cancelBooking(resId, "Single-101", inventory);

        // 3. Show Rollback History
        cancellationService.showRollbackHistory();

        // 4. Verify Inventory Restore
        System.out.println("\nUpdated Single Room Availability: " +
                inventory.getRoomAvailability().get("Single Room"));
    }
}