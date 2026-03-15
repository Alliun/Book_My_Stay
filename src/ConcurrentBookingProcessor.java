public class ConcurrentBookingProcessor implements Runnable {
    private final BookingRequestQueue bookingQueue;
    private final RoomInventory inventory;
    private final RoomAllocationService allocationService;

    public ConcurrentBookingProcessor(BookingRequestQueue bq, RoomInventory inv, RoomAllocationService as) {
        this.bookingQueue = bq;
        this.inventory = inv;
        this.allocationService = as;
    }

    @Override
    public void run() {
        while (true) {
            Reservation reservation = null;

            // Synchronize directly on the bookingQueue object
            synchronized (bookingQueue) {
                if (bookingQueue.isEmpty()) {
                    break;
                }
                reservation = bookingQueue.poll();
            }

            if (reservation != null) {
                synchronized (inventory) {
                    allocationService.allocateRoom(reservation, inventory);
                }
            }
        }
    }
}