package unidad1.inferencia;

import mx.edu.unit1.neural.model.RedNeuronal; // Importando desde el JAR

public class InferenciaService {
    public void ejecutar() {
        RedNeuronal miRed = new RedNeuronal(8, new int[10], "activada"); // ¡Ya puedes usarla!
    }
}