class PaymentProcessor {

    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Credit Card Payment for card: " + creditCard.getCardNumber());
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing PayPal Payment for account: " + payPal.getEmail());
    }

    public void processPayment() {
        System.out.println("Processing Bitcoin Payment");
    }

    public void processPayment(ApplePay applePay) {
        System.out.println("Processing Apple Pay Payment for device: " + applePay.getDeviceId());
    }
}
