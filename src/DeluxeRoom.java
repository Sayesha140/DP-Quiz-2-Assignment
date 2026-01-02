class DeluxeRoom extends RoomBooking {
    protected void confirmBooking() {
        System.out.println("Deluxe room booking confirmed");
    }

    protected double getCost() {
        return 180.0;
    }
}