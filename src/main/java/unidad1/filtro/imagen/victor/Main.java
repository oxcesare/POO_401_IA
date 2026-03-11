package unidad1.filtro.imagen.victor;

public class Main {

    public static void main(String[] args) {


        // Crear una imagen de ejemplo (matriz de píxeles)
        int[][] dato = {
                {255, 255, 255},
                {255, 0, 255},
                {255, 255, 255}
        };

        FiltroImagen filtro = new FiltroImagen(dato);

        ReductorDeRuido reductor = new ReductorDeRuido(dato);
        reductor.kernel();




    }
}
