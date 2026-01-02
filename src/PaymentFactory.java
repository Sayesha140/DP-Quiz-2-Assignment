class PaymentFactory {
    public static PaymentStrategy createPayment(String type) {
        if (type.equalsIgnoreCase("CARD"))
            return new CardPayment();
        else if (type.equalsIgnoreCase("CASH"))
            return new CashPayment();
        else
            throw new IllegalArgumentException("Invalid payment type");
    }
}
