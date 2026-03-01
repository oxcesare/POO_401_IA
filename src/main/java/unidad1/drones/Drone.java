package unidad1.drones;

public class Drone {
    // 1. ATRIBUTOS (El estado de cada objeto)
    public String id;
    public int nivelBateria;

    // 2. CONSTRUCTOR (Cómo se crea cada objeto)
    public Drone(String id) {
        this.id = id;
        this.nivelBateria = 100; // Todos inician cargados
    }

    // 3. MÉTODOS (Lo que el objeto sabe hacer)
    public void volar(int gasto) {
        this.nivelBateria -= gasto;
        System.out.println("Drone " + id + " volando... Batería restante: " + nivelBateria + "%");
    }
}