package certificacion.fase9.practica07;

public class Test01 {
    public static void main(String[] args) {
        try{
            int i=  9/0;
            System.out.println(i);
        }finally {
            System.out.println("El finally siempre se va a ejecutar");
        }
    }
}
