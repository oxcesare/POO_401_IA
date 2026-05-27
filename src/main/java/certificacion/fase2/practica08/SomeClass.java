package certificacion.fase2.practica08;

public class SomeClass {
    //Variable de instancia s1
    String s1 = "Hello World";

    //metodo de tipo String llamado generateReporte
    //que reciba un argumento de tipo entero llamado n
    public void generateReporte(int n) {
        String local;
        if (n > 0) {
            local = "good";
        } else {
            local = "bad";
        }
        System.out.println(local);
    }
}
