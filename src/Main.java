public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        CreditCard creditCard = new CreditCard();
        PayPal payPal = new PayPal();
       Bitcoin bitcoin = new Bitcoin();
        ApplePay applePay = new ApplePay();
        System.out.println("Attempting payment with Credit Card:");
        processor.processPayment(creditCard);
        System.out.println("Attempting payment with Pay pal:");
        processor.processPayment(payPal);
        System.out.println("Attempting payment with Bit Coin:");
        processor.processPayment(bitcoin);
        System.out.println("Attempting payment with Apple Pay:");
        processor.processPayment(applePay);
    }
}
