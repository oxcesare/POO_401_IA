package certificacion.practica16;

public class Main {

    public static void main(String[] args) {

        Calculadora c = new Calculadora();

        try {
            c.divide(0, 3);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }


    }
}
