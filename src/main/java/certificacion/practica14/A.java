package certificacion.practica14;

class A {
    public void m1() { System.out.println("Desde A"); }
}

class B extends A {
    public void m1() { System.out.println("Desde B"); }
}

class C extends B {
    public void m1() {
        super.m1(); // Esto imprimirá "Desde B"

        // ((A) this).m1(); // Esto NO imprime A, sigue imprimiendo C (Bucle infinito si no se maneja)

        System.out.println("Desde C");
    }
}
