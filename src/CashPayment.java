class CashPayment implements PaymentStrategy {
    public void pay(double amount) {
        System.out.println("Cash payment of $" + amount + " at hotel");
    }
}