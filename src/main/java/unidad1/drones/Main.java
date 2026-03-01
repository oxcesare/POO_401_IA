package unidad1.drones;

public class Main {
    public static void main(String[] args) {
        // INSTANCIACIÓN: Aquí creamos los OBJETOS a partir de la CLASE
        Drone alpha = new Drone("Alpha-1");
        Drone beta = new Drone("Beta-2");
        Drone gamma = new Drone("Gamma-3");

        System.out.println("--- Estado Inicial ---");

        // Cada objeto es independiente

        try {
            System.out.println("Batería de Alpha: " + alpha.nivelBateria + "%");
            System.out.println("Batería de Beta: " + beta.nivelBateria + "%");
            System.out.println("Batería de Gamma: " + gamma.nivelBateria + "%");
            alpha.volar(Integer.parseInt("a"));
            alpha.volar(15);
        } catch (Exception e) {
            System.out.println("Error al acceder a la batería: " + e.getMessage());
            System.out.println("Error al acceder al metodo volar: " + e.getMessage());
        }


        System.out.println("\n--- Verificación de Independencia ---");
        System.out.println("Batería de Alpha: " + alpha.nivelBateria + "%");
        System.out.println("Batería de Beta: " + beta.nivelBateria + "% (¡Sigue al 100%!)");
    }
}
