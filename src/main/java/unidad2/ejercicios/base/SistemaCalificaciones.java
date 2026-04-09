package unidad2.ejercicios.base;

public class SistemaCalificaciones {

    public static void main(String[] args) {
        int notaExamen = 70;

        if(notaExamen>=60){
            System.out.println("Felicidades, has aprobado el examen.");
            if(notaExamen>=90){
                System.out.println("Excelente desempeño");
            }
        }else{
            System.out.println("Lo sentimos, no has aprobado");
        }

        // sentencia switch
        char califacionLiteral;
        switch (notaExamen){
            case 100:
            case 90:
                califacionLiteral = 'A';
                 break;
            case 80:
                califacionLiteral = 'B';
                break;
            case 70:
                califacionLiteral = 'C';
                break;
            case 60:
                califacionLiteral = 'D';
                break;
            default:
                califacionLiteral = 'F';
                break;
        }
        System.out.println("Tu califiación es: " + " " +  califacionLiteral);
    }
}
