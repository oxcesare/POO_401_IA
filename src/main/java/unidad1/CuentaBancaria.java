package unidad1;

public class CuentaBancaria {

    private double saldo;

    CuentaBancaria(double saldo){
        this.saldo=saldo;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
