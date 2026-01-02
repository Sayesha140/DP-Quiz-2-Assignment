class SeaView extends RoomDecorator {
    public SeaView(RoomBooking room) {
        super(room);
    }

    protected void confirmBooking() {
        room.confirmBooking();
        System.out.println("Sea view added");
    }

    @Override
    public double getCost() {
        return super.getCost()+50;
    }
}