package certificacion.fase17.practica02;

interface CanWalk {
    default void walk() {
        System.out.println("Walking...");
    }
}


interface CanRun {
    public default void walk() {
        System.out.println("Running...");
    }

    public abstract void run();
}

interface CanSprint extends CanWalk, CanRun {
    void sprint();


    /**
     * Para que no haya error entonces mandamos a llamar al
     * metodo de la clase padre o de la interface Padre mejor dicho.
     */
    @Override
    default void walk() {
        CanWalk.super.walk();
    }
}
