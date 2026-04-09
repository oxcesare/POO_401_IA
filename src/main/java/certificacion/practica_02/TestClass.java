package certificacion.practica_02;

public class TestClass {

    public static void main(String[] args) {
        Flyer f = new Eagle();
        Eagle e = new Eagle();
        Bat b  = new Bat();

        if( f instanceof Flyer){
            System.out.println("f es un Flyer");
        }
        if(e instanceof Bird){
            System.out.println("e es un Bird");
        }

        //Esta referencia da un error de compilacion
        // un Bat no puede ser un Bird
        if(b instanceof Bird){
            System.out.println("b es un Bird");
        }



    }
}

interface  Flyer{

}

class Bird implements Flyer{

}

class Eagle extends  Bird{

}

class Bat extends Bird {

}
