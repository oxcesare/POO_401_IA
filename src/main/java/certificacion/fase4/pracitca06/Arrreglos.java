package certificacion.fase4.pracitca06;

public class Arrreglos {
    public static void main(String[] args) {

        String [][] matrix = new String[2][2];
        matrix[0][0] = "petrol";
        matrix[1][0] = "diesel";
        matrix[0][1] = "manual";
        matrix[1][1] = "auto";

        //imprmir la siguiente salida diesel:manual:auto
        for(int i=2; i>0; i--){
            for(int j=0; j<2; j++){
                System.out.println(matrix[j][i]);
            }
        }
     }
}
