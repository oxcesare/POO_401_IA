package certificacion.fase5.practica05;

public class Test01 {

    public static void main(String[] args) {

        //Recordar que los arreglos que solo se inicializan con int
        //int es un primitivo y por la tanto se inicia con valor por defeto 0
        int size =10;
        int [] arr = new int[size];
        for(int i=0;i<size;++i){
            System.out.println(arr[i]);
        }
    }
}
