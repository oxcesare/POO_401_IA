package unidad3.listas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DatasetManager {
    public static void main(String[] args) {
        // 1. Instanciación: Usamos ArrayList para acceso rápido por índice
        List<String> dataset = new ArrayList<>();

        // 2. Método add(): Carga de datos
        dataset.add("gato_01.jpg");
        dataset.add("perro_01.jpg");
        dataset.add("gato_02.jpg");
        dataset.add("perro_02.jpg");
        dataset.add("gato_03.jpg");
        dataset.add("desconocido.tmp"); // Dato corrupto para el ejemplo

        System.out.println("Dataset original: " + dataset);

        // 3. Método size(): Conocer la dimensión del vector de entrada
        System.out.println("Cantidad de ejemplos: " + dataset.size());

        // 4. Método contains() e indexOf(): Localizar datos específicos
        if (dataset.contains("desconocido.tmp")) {
            int index = dataset.indexOf("desconocido.tmp");
            // 5. Método remove(): Limpieza de datos (Data Cleaning)
            dataset.remove(index);
            System.out.println("Dato corrupto eliminado en posición: " + index);
        }

        // 6. Collections.shuffle(): Mezclado aleatorio (Vital para el entrenamiento)
        // Esto evita que el modelo aprenda el orden de los datos en lugar de sus rasgos
        Collections.shuffle(dataset);
        System.out.println("Dataset mezclado (Shuffled): " + dataset);

        // 7. Método subList(): Creación de Batch o división Train/Test
        // Tomamos los primeros 3 elementos para un 'Mini-batch' de entrenamiento
        List<String> miniBatch = dataset.subList(0, 3);
        System.out.println("Mini-batch de entrenamiento: " + miniBatch);

        // 8. Método set(): Reemplazar un dato (Data Augmentation simulado)
        dataset.set(0, dataset.get(0).replace(".jpg", "_rotated.jpg"));

        // 9. Método clear(): Liberar memoria tras el entrenamiento
        System.out.println("Último estado antes de limpiar: " + dataset.get(0));
        dataset.clear();
        System.out.println("Dataset listo para nueva carga. Tamaño: " + dataset.size());
    }
}