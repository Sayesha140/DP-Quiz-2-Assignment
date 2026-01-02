class Breakfast extends RoomDecorator {
    public Breakfast(RoomBooking room) {
        super(room);
    }

    protected void confirmBooking() {
        room.confirmBooking();
        System.out.println("Breakfast is included");
    }

    @Override
    public double getCost() {
        return super.getCost()+20;
    }
}