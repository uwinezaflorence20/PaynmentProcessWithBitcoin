class PaymentProcessor {

    public void processPayment(CreditCard creditCard) {
        System.out.println("Processing Credit Card payment");
    }

    public void processPayment(PayPal payPal) {
        System.out.println("Processing Pay pal payment");
    }

    public void processPayment(Bitcoin bitcoin) {

        System.out.println("Processing Bitcoin Payment");
    }

    public void processPayment(ApplePay applePay) {
        System.out.println("Processing Apple Pay Payment ");
    }
}
