package unidad3.exceptions;

public class NullPointerException {

    int numero;

    public static void main(String[] args) {

        try {
            NullPointerException cs = null;
            System.out.println(cs.getNumero());
        } catch (Exception e) {
            System.out.println("error" + e.getMessage());
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
