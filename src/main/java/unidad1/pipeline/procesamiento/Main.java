package unidad1.pipeline.procesamiento;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Lista polimórfica que acepta cualquier tipo de filtro
        List<FiltroImagen> pipeline = new ArrayList<>();

        pipeline.add(new ReductorDeRuido());
        pipeline.add(new DetectorDeBordes());
        pipeline.add(new EscalaDeGrises());

        // El motor de ejecución no sabe qué filtro es, solo sabe que todos "procesan"
        for (FiltroImagen f : pipeline) {
            f.procesar();
        }

        // Podemos cambiar el filtro sin modificar el motor de ejecución
        System.out.println("*****************************************");

        // Reemplazamos el filtro de reducción de ruido por otro sin cambiar el motor de ejecución


        System.out.println("*****************************************");
        FiltroImagen filtro = new ReductorDeRuido();
        mostrar(filtro);

        FiltroImagen otroFiltro = new EscalaDeGrises();
        mostrar(otroFiltro);

    }

    public static void mostrar(FiltroImagen filtro) {
        System.out.println("Mostrando el resultado del filtro:");
        filtro.procesar();
    }
}
