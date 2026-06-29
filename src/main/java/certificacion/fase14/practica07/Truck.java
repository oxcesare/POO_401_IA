package certificacion.fase14.practica07;

class Automobile {
    public void drive() {
        System.out.println("Automobile is driving");
    }
}

public class Truck extends Automobile {

    public void drive() {
        System.out.println("Truck is driving");
    }

    public static void main(String[] args) {
        Automobile a = new Automobile();
        Truck t = new Truck();
        a.drive();
        t.drive();
        a = t;
        a.drive();

    }
}
