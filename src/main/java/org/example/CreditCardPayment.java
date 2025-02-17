public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("hai pagato con carta di credito");
    }
}
