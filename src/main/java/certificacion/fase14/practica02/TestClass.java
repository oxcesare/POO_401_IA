package certificacion.fase14.practica02;

interface  Flyer{

}

class Bird implements Flyer{

}

class Eagle extends Bird{

}

class Bat{

}

public class TestClass {
    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();
        if(b instanceof Flyer){
        }
    }
}
