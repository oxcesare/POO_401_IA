package certificacion.fase15.practica03;

interface Movable {
    int x=0;
}

class A implements Movable {
    int x=100;
}
public class Test {

    public static void main(String[] args) {
        A a = new A();
        int d =a.x;
    }
}
