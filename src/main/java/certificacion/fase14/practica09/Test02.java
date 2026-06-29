package certificacion.fase14.practica09;

public class Test02 {
    static String str = "Hello Wordl";

    public static void main(String[] args) {

        changeIt(str);
        System.out.println(str);


    }

    public static void changeIt(String s) {
        s = "Good bye world";
    }
}
