/**
 * MAIN CLASS - UseCase4RoomSearch
 * =====================================================================
 * Use Case 4: Room Search & Availability Check
 *
 * @version 4.0
 */
public class UseCase4RoomSearch {

    public static void main(String[] args) {
        // Initialize room definitions
        Room singleRoom = new SingleRoom();
        Room doubleRoom = new DoubleRoom();
        Room suiteRoom = new SuiteRoom();

        // Initialize inventory state
        RoomInventory inventory = new RoomInventory();

        // Initialize the Search Service (Separation of Concerns)
        RoomSearchService searchService = new RoomSearchService();

        // Execute Search
        searchService.searchAvailableRooms(inventory, singleRoom, doubleRoom, suiteRoom);
    }
}