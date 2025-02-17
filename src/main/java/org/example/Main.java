public class Main {
    public static void main(String[] args) {
        ShoppingCart carrello=new ShoppingCart(new CreditCardPayment());
        ShoppingCart carrello2=new ShoppingCart(new PayPalPayment());

        carrello.pay();
        carrello2.pay();
    }
}