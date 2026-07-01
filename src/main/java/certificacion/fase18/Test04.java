package certificacion.fase18;

public class Test04 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb.toString());
        sb.delete(0,sb.length());
        System.out.println(sb.toString());
    }
}
