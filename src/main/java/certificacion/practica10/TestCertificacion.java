package certificacion.practica10;

// Opción 3: LEGAL - Clase abstracta con método concreto vacío
abstract class Automobile3 {
    void honk() {};
}

// Opción 5: LEGAL - Clase abstracta con método abstracto
abstract class Automobile5 {
    abstract void honk();
}

/*
// TEST DE ERRORES (Descomenta para ver el error en IntelliJ)

class Automobile1 {
    abstract void honk(); // ERROR: Abstract method in non-abstract class
}

abstract class Automobile2 {
    void honk(); // ERROR: Missing method body, or declare abstract
}

abstract class Automobile4 {
    abstract void honk() {} // ERROR: Abstract methods cannot have a body
}
*/

public class TestCertificacion {
    public static void main(String[] args) {
        // Automobile3 auto = new Automobile3(); // ERROR: Cannot be instantiated
        System.out.println("Las clases abstractas no permiten 'new'");
    }
}