/**
 * =====================================================================
 * MAIN CLASS - UseCase2RoomInitialization
 * =====================================================================
 *
 * Use Case 2: Basic Room Types & Static Availability
 *
 * Description:
 * This class demonstrates room initialization
 * using domain models before introducing
 * centralized inventory management.
 *
 * Availability is represented using
 * simple variables to highlight limitations.
 *
 * @version 2.1
 */
public class UseCase2RoomInitialization {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Initialize room objects
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Availability represented using simple variables
        int singleRoomAvailability = 5;
        int doubleRoomAvailability = 3;
        int suiteRoomAvailability = 2;

        // Print room details
        System.out.println("Hotel Room Initialization\n");

        System.out.println("Single Room:");
        System.out.println("Beds: " + singleRoom.numberOfBeds);
        System.out.println("Size: " + singleRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + singleRoom.pricePerNight);
        System.out.println("Available: " + singleRoomAvailability + "\n");

        System.out.println("Double Room:");
        System.out.println("Beds: " + doubleRoom.numberOfBeds);
        System.out.println("Size: " + doubleRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + doubleRoom.pricePerNight);
        System.out.println("Available: " + doubleRoomAvailability + "\n");

        System.out.println("Suite Room:");
        System.out.println("Beds: " + suiteRoom.numberOfBeds);
        System.out.println("Size: " + suiteRoom.squareFeet + " sqft");
        System.out.println("Price per night: " + suiteRoom.pricePerNight);
        System.out.println("Available: " + suiteRoomAvailability);
    }
}