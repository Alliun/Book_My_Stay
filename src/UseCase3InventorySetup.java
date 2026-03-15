/**
 * MAIN CLASS - UseCase3InventorySetup
 * =====================================================================
 * @version 3.0
 */
public class UseCase3InventorySetup {

    public static void main(String[] args) {
        // Initialize objects from UC2
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Centralized inventory component from UC3
        RoomInventory inventory = new RoomInventory();

        System.out.println("Hotel Room Inventory Status\n");

        // Single Room
        System.out.println("Single Room:");
        System.out.println("Beds: " + singleRoom.numberOfBeds);
        System.out.println("Size: " + singleRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + singleRoom.pricePerNight);
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Single Room") + "\n");

        // Double Room
        System.out.println("Double Room:");
        System.out.println("Beds: " + doubleRoom.numberOfBeds);
        System.out.println("Size: " + doubleRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + doubleRoom.pricePerNight);
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Double Room") + "\n");

        // Suite Room
        System.out.println("Suite Room:");
        System.out.println("Beds: " + suiteRoom.numberOfBeds);
        System.out.println("Size: " + suiteRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + suiteRoom.pricePerNight);
        System.out.println("Available Rooms: " + inventory.getRoomAvailability().get("Suite Room"));
    }
}