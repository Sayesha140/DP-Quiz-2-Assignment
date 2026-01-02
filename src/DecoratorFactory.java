class DecoratorFactory {
    public static RoomBooking addFeature(RoomBooking room, String feature) {
        if (feature.equalsIgnoreCase("BREAKFAST"))
            return new Breakfast(room);
        else if (feature.equalsIgnoreCase("SEAVIEW"))
            return new SeaView(room);
        else
            return room;
    }
}
