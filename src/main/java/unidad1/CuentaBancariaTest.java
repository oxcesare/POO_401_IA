package unidad1;

public class CuentaBancariaTest {

    public static void main(String[] args) {


        CuentaBancaria cb = new CuentaBancaria(2000.00);
        System.out.println("Saldo Inicial " + cb.getSaldo());

        cb.setSaldo(cb.getSaldo() + 500.00);

        System.out.println("Saldo Final " + cb.getSaldo());


    }
}
