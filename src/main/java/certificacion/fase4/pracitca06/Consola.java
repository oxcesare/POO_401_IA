package certificacion.fase4.pracitca06;

public class Consola {
    public static void main(String[] args) {
         int i = args.length - 1;
        System.out.println(i);
        if (i > 0) {
            System.out.println(args[i]);
        }
    }
}
