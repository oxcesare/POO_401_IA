package certificacion.practica18;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {

        //Crear una lista de alumnos
        List<Alumno> alumnos = List.of(
                new Alumno("Juan", "12345", 20),
                new Alumno("Maria", "67890", 22),
                new Alumno("Pedro", "54321", 19)
        );

        //imprimo lista original
        System.out.println("Lista original:");
        alumnos.forEach(System.out::println);


        System.out.println("\nLista ordenada por edad:");
        //Ordenrar esa lista de alumnos
        alumnos.stream()
                .sorted((a1, a2) -> a1.getEdad().compareTo(a2.getEdad()))
                .forEach(System.out::println);


    }
}
