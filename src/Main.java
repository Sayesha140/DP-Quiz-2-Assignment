//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RoomBooking room = RoomFactory.createRoom("DELUXE");

        room = DecoratorFactory.addFeature(room, "BREAKFAST");
        room = DecoratorFactory.addFeature(room, "SEAVIEW");

        room.setPaymentStrategy(
                PaymentFactory.createPayment("CARD")
        );

        room.bookRoom();
    }
}
