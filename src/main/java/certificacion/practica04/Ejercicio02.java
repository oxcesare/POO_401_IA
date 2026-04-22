package certificacion.practica04;

public class Ejercicio02 {

    public static void main(String[] args) {


        int i =1;
        int j = i++;
        if((i==++j) | (i++ == j)){
            i+=j;
        }
        System.out.println(i);
    }
}
