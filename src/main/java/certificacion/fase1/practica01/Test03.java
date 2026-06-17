package certificacion.fase1.practica01;

public class Test03 {
    static String str ="Hello World";

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }

    public static void changeIt(String s){
        s ="Good bye world";
    }
}
