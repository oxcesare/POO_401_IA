package unidad_1.herencia.practica_01;

public class DeepLearning extends ModeloIA{

    //constructor clase hija
    public DeepLearning() {
        System.out.println("Constructor de la clase DeepLearning");
    }


    @Override
    public void entrenar() {
        System.out.println("Entrenando el modelo de Deep Learning");
    }
}

