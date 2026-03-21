package unidad2.base.interfaces;

public class Main {
    public static void main(String[] args) {


        // Variable Polimórfica: El tipo es la interfaz más alta
        Procesable miCapa = new CapaDensa("Hidden_Layer_1");

        // Podemos tratarla como algo procesable
        miCapa.procesar();

        // Si necesitamos usar métodos específicos de IA, hacemos un cast seguro
        if (miCapa instanceof CapaNeuronal) {
            System.out.println("Si es del tipo CapaNeuronal");
            System.out.println("Ahora puedo actualizar los pesos de la capa...");
            ((CapaNeuronal) miCapa).actualizarPesos(0.01);
        }
    }
}
