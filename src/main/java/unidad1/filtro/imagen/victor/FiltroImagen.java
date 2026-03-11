package unidad1.filtro.imagen.victor;


public class FiltroImagen  {

    private int[][] dato;

    public FiltroImagen( int[][] dato) {
        this.dato = dato;
    }

    public int[][] getDato() {
        return dato;
    }

    public void setDato(int[][] dato) {
        this.dato = dato;
    }

    public void  aplicar() {
        int[][] pixeles = getDato();
    }


}