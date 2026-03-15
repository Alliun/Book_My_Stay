/**
 * MAIN CLASS - UseCase7AddOnServiceSelection
 */
public class UseCase7AddOnServiceSelection {
    public static void main(String[] args) {
        AddOnServiceManager manager = new AddOnServiceManager();

        // Guest with Reservation ID: Single-1 wants Breakfast and Spa
        String resId = "Single-1";

        manager.addService(resId, new AddOnService("Breakfast", 500.0));
        manager.addService(resId, new AddOnService("Spa", 1000.0));

        System.out.println("Add-On Service Selection");
        System.out.println("Reservation ID: " + resId);
        System.out.println("Total Add-On Cost: " + manager.calculateTotalServiceCost(resId));
    }
}