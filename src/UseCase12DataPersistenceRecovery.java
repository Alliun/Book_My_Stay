/**
 * MAIN CLASS - UseCase12DataPersistenceRecovery
 * Use Case 12: Data Persistence & System Recovery
 */
public class UseCase12DataPersistenceRecovery {
    public static void main(String[] args) {
        System.out.println("System Recovery");

        RoomInventory inventory = new RoomInventory();
        FilePersistenceService persistenceService = new FilePersistenceService();
        String persistenceFile = "inventory_state.txt";

        // 1. Attempt to recover previous state
        persistenceService.loadInventory(inventory, persistenceFile);

        // 2. Display current state (Recovered or Fresh)
        System.out.println("\nCurrent Inventory:");
        inventory.getRoomAvailability().forEach((type, count) ->
                System.out.println(type.replace(" Room", "") + ": " + count));

        // 3. Save current state for next restart
        persistenceService.saveInventory(inventory, persistenceFile);
    }
}