package unidad2.record;

public class PersonaTest {

    public static void main(String[] args) {

        Persona p1 = new Persona("Juan", 20);
        Persona p2 = new Persona("Cesar", 22);
        Persona p3 = new Persona("Ricardo", 24);
        Persona p4 = new Persona("Julio", 25);
        Persona p5 = new Persona("Leah", 27);

        System.out.println(p1.nombre());
        System.out.println(p2.nombre());
        System.out.println(p3.nombre());
        System.out.println(p4.nombre());
        System.out.println(p5.nombre());


    }
}
