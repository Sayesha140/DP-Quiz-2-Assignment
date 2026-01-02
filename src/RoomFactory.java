class RoomFactory {
    public static RoomBooking createRoom(String type) {
        if (type.equalsIgnoreCase("STANDARD"))
            return new StandardRoom();
        else if (type.equalsIgnoreCase("DELUXE"))
            return new DeluxeRoom();
        else
            throw new IllegalArgumentException("Invalid room type");
    }
}
