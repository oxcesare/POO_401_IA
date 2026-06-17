package certificacion.fase7;

public class Main {

    public static void main(String[] args) {
        main(new String[][]{{"a","b","c"}});
    }

    public static void main(String[][] args) {

        String [] a ={"a","b","c"};
        String [][] c = {a};
        System.out.println(c[0][0]);
        System.out.println(c[0][1]);

    }

}
