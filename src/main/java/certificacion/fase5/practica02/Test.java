package certificacion.fase5.practica02;

public class Test {

    static int[][] table = new int[2][3];

    public static void init() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                // manera correcta de inicializar un arreglo
                // table[i,j] = i+j;
                table[i][j] = i + j;
            }
        }
    }

    public static void multiply() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = table[i][j] * 2;
            }
        }
    }

    public static void main(String[] args) {
        init();
        multiply();

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
