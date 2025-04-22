public class PaymentProcessor {

    public void processPayment(CreditCard card) {
        System.out.println("Processing Credit Card Payment");

    }

    public void processPayment(PayPal paypal) {
        System.out.println("Processing PayPal Payment");

    }

    public void processPayment(String paymentMethodType, double amount) {
           if ("creditcard".equalsIgnoreCase(paymentMethodType)) {
                     processPayment(new CreditCard()); // Call the CreditCard version
                     System.out.println("Amount: $" + amount);
                 } else if ("paypal".equalsIgnoreCase(paymentMethodType)) {
                     processPayment(new PayPal());     // Call the PayPal version
                     System.out.println("Amount: $" + amount);
                 } else {
                     System.out.println("Unsupported payment method: " + paymentMethodType);
                 }
         }

}


class CreditCard {



}

class PayPal{


}

