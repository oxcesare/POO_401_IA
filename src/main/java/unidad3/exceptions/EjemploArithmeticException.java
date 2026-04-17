package unidad3.exceptions;

public class EjemploArithmeticException {

    public static void main(String[] args) {
        try{
            int rest = 10/0;
            System.out.println(rest);
        }catch (Exception e){
            System.out.println(""+e.getCause());
        }finally {
            System.out.println("Siempre se ejecuta");
        }
    }
}
