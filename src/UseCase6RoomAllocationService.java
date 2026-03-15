/**
 * MAIN CLASS - UseCase6RoomAllocationService
 * @version 6.0
 */
public class UseCase6RoomAllocationService {
    public static void main(String[] args) {
        RoomInventory inventory = new RoomInventory();
        BookingRequestQueue queueManager = new BookingRequestQueue();

        // Adding requests in order
        queueManager.addRequest(new Reservation("Alice", "Single Room"));
        queueManager.addRequest(new Reservation("Bob", "Double Room"));
        queueManager.addRequest(new Reservation("Charlie", "Single Room"));
        queueManager.addRequest(new Reservation("Dave", "Suite Room"));

        RoomAllocationService allocationService = new RoomAllocationService();
        allocationService.processAllocations(queueManager, inventory);

        System.out.println("\nFinal Inventory Status:");
        inventory.getRoomAvailability().forEach((type, count) ->
                System.out.println(type + ": " + count + " left"));
    }
}