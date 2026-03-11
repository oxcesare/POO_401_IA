package unidad1.filtro.imagen.victor;

public class ReductorDeRuido extends FiltroImagen {

    public ReductorDeRuido(int[][] dato) {
        super(dato);
    }

    public void kernel() {
        System.out.println("Reductor de Ruido");

        int[][] pixeles = getDato();

        //Recorrer el arreglo de pixele
        for (int i = 0; i < pixeles.length; i++) {
            for (int j = 0; j < pixeles[i].length; j++) {
                System.out.println("Pixel [" + i + "][" + j + "]: " + pixeles[i][j]);
            }
        }
        System.out.println("aplicando kernel");

    }
}