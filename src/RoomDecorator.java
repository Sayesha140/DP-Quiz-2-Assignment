abstract class RoomDecorator extends RoomBooking {
    protected RoomBooking room;

    public RoomDecorator(RoomBooking room) {
        this.room = room;
    }
    public double getCost() {
        return room.getCost();
    }
}
