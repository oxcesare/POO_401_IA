package unidad_1.herencia.practica_01;

public class Main {

    public static void main(String[] args) {


        // Crear una instancia de DeepLearning
        DeepLearning deepLearning = new DeepLearning();
        deepLearning.entrenar();
        deepLearning.asignarPeso();

        System.out.println();

        // Crear una instancia de ArbolDeDecision
        ArbolDeDecision arbolDeDecision = new ArbolDeDecision();
        arbolDeDecision.entrenar();
        arbolDeDecision.asignarPeso();
    }
}

