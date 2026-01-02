abstract class RoomBooking {
    protected PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public final void bookRoom() {
        checkAvailability();
        reserveRoom();
        confirmBooking();
        makePayment();
    }

    protected void checkAvailability() {
        System.out.println("Checking room availability");
    }

    protected void reserveRoom() {
        System.out.println("Room reserved");
    }

    protected abstract void confirmBooking();
    protected abstract double getCost();

    protected void makePayment() {
        paymentStrategy.pay(getCost());
    }
}
