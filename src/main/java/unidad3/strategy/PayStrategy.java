package unidad3.strategy;

public interface PayStrategy {

    boolean pay(int paymentAmount);
    void collectPaymentDetails();
}
