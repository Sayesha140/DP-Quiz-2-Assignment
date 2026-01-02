class StandardRoom extends RoomBooking {
    protected void confirmBooking() {
        System.out.println("Standard room booking confirmed");
    }

    protected double getCost() {
        return 100.0;
    }
}