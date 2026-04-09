package certificacion;

public class Types {

    public static void main(String[] args) {


        short s = 9;

        Short k = 10;

        //Hasta Java 8 no se podía usar instanceof con tipos primitivos, pero a partir de Java 8,
        // se introdujo la capacidad de usar instanceof con tipos primitivos. Sin embargo, en este caso,
        // s es un tipo primitivo y no un objeto, por lo que el resultado de s instanceof Short será false.
        //System.out.println(s instanceof Short); // esto en java 8 da error



        System.out.println(k instanceof Short); // true



    }
}
