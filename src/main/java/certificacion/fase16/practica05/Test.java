package certificacion.fase16.practica05;

public class Test {

    public static void stringTest(String s) {
        s.replace('h', 's');
    }

    public static void strinBuilderTest(StringBuilder s) {
        s.append("o");
    }

    public static void main(String[] args) {
        String s = "hell";
        StringBuilder sb = new StringBuilder("well");
        stringTest(s);
        strinBuilderTest(sb);
        System.out.println(s + sb);
    }
}
