package unidad3.ejercicios;

public class ControlAdicional {
    public static void main(String[] args) {
        // Sección 1: break [cite: 167]
        System.out.println("Probando break:");
        for (int i = 1; i <= 10; i++) { // [cite: 168]
            if (i == 5) { // [cite: 169]
                break; // Sale del ciclo [cite: 170]
            }
            System.out.print(i + " "); // [cite: 171]
        }

        // Sección 2: continue [cite: 172]
        System.out.println("\nProbando continue (impares):");
        for (int i = 1; i <= 10; i++) { // [cite: 173]
            if (i % 2 == 0) { // Verifica si es par [cite: 174, 175]
                continue; // Salta iteración [cite: 176]
            }
            System.out.print(i + " "); // [cite: 177]
        }

        // Sección 3: return [cite: 178]
        System.out.println("\nProbando return:");
        int[] misNumeros = {10, 20, 30, 40, 50};
        String resultado = encontrarNumero(misNumeros, 30); // [cite: 186]
        System.out.println(resultado);
    }

    // Método separado para búsqueda [cite: 179, 180]
    public static String encontrarNumero(int[] arreglo, int objetivo) {
        for (int i = 0; i < arreglo.length; i++) { // [cite: 181]
            if (arreglo[i] == objetivo) {
                return "Número " + objetivo + " fue encontrado."; // Sale del método [cite: 184]
            }
        }
        return "El número no se encontró."; // Si termina el ciclo [cite: 185]
    }
}