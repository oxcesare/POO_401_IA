package certificacion.fase16.practica01;

public class Test {
    public static void main(String[] args) {
        try {
            System.out.println("12345".charAt(6));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.getCause());
        } finally {
            System.out.println("finally");
        }

        System.out.println("01234567".substring(4, 7));
    }
}
