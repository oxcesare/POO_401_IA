package unidad3.gestion.empleados;

public class Empleado {

    private int id;
    private float salario;

    //Constructor que inicializa el id y el salario
    public Empleado(int id, float salario) {
        this.id = id;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void aumentarSalario(float porcentaje) {
        setSalario(getSalario() * (1 + porcentaje / 100));
    }

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, 30000);
        System.out.println("Salario inicial del empleado 1: " + empleado1.getSalario());

        empleado1.aumentarSalario(10); // Aumenta el salario en un 10%
        System.out.println("Salario después del aumento del 10%: " + empleado1.getSalario());
    }


}
