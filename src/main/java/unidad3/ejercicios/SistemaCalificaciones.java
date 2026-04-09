package unidad3.ejercicios;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        int notaExamen = 95; // Inicialización entre 0 y 100 [cite: 7]

        // Validación opcional de rango [cite: 23]
        if (notaExamen < 0 || notaExamen > 100) {
            System.out.println("La nota es inválida");
        } else {
            // Sentencia if-else para aprobación [cite: 8]
            if (notaExamen >= 60) {
                System.out.println("¡Felicidades, has aprobado!"); // [cite: 9]

                // Bloque if anidado [cite: 11]
                if (notaExamen >= 90) {
                    System.out.println("¡Excelente desempeño!"); // [cite: 12]
                }
            } else {
                System.out.println("Lo sentimos, no has aprobado."); // [cite: 10]
            }

            // Sentencia switch para calificación literal [cite: 13, 14]
            char calificacionLiteral;
            // Nota: En Java moderno se puede usar switch con rangos calculados
            int rango = notaExamen / 10;
            switch (rango) {
                case 10:
                case 9:
                    calificacionLiteral = 'A'; // 90-100 [cite: 15]
                    break;
                case 8:
                    calificacionLiteral = 'B'; // 80-89 [cite: 16]
                    break;
                case 7:
                    calificacionLiteral = 'C'; // 70-79 [cite: 18]
                    break;
                case 6:
                    calificacionLiteral = 'D'; // 60-69 [cite: 19]
                    break;
                default:
                    calificacionLiteral = 'F'; // 0-59 [cite: 20]
                    break;
            }
            System.out.println("Tu calificación es: " + calificacionLiteral); // [cite: 22]
        }
    }
}