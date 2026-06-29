package certificacion.fase15.pracitca07;

interface Flyer {

}

class Bird implements Flyer {

}

class Eagle extends Bird{

}

class  Bat{

}

public class TestClass {
    public static void main(String[] args) {

        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b = new Bat();


    }
}
