package certificacion.fase5.practica02;

public class Matriz {
    public static void main(String[] args) {


        String [][] matriz = new String[2][2];
        matriz[0][0] = "petrol";
        matriz[1][0] = "diesel";
        matriz[0][1] = "manual";
        matriz[1][1] = "auto";

        for(int i=0; i<2; i++){
            for(int j=0; j<2; j++){
                System.out.print(matriz[j][i] + " ");
            }
        }

    }
}
