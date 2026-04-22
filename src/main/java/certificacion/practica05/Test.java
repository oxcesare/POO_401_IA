package certificacion.practica05;

public class Test {
    public static void main(String[] args) {

        String[][] matrix = new String[2][2];
        matrix[0][0] = "petrol";
        matrix[1][0] = "diesel";
        matrix[0][1] = "manual";
        matrix[1][1] = "auto";

        for (int i = 1; i < 2; i++) {
            for (int j = 1; j < 2; j++) {
                System.out.print(matrix[i][j] + ":");
            }
        }

        System.out.println("**********************");

        for(String [] row : matrix){
            for(String cell : row){
                System.out.print(cell + ":");
            }
        }
    }
}
