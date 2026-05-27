package certificacion.practica18;

import java.util.Comparator;

public class Alumno implements Comparator<Alumno> {

    private String nombre;
    private String matricula;
    private Integer edad;

    Alumno(String nombre, String matricula, Integer edad) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", matricula='" + matricula + '\'' +
                ", edad=" + edad +
                '}';
    }

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o1.getEdad().compareTo(o2.getEdad());
    }
}
