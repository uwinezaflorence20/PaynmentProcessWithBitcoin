public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard("1234-5678-9012-3456");
        PayPal payPal = new PayPal("user@example.com");
       Bitcoin bitcoin = new Bitcoin();
        ApplePay applePay = new ApplePay("Device001");

        processor.processPayment(creditCard);
        processor.processPayment(payPal);
       processor.processPayment();
        processor.processPayment(applePay);
    }
}
