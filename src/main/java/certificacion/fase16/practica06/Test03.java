package certificacion.fase16.practica06;

public class Test03 {
    static String str ="Hello World";

    public static void changeIt(String s){
        s ="Good bye world";
    }

    public static void main(String[] args) {
        changeIt(str);
        System.out.println(str);
    }
}
