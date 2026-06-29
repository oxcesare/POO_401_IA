package certificacion.fase15.practica04;


class Game {
    public void play() throws Exception {
        System.out.println("Playing.....");
    }
}

class Soccer extends Game {
    public void play(String ball) {
        System.out.println("Playing Soccer with:  " + ball);
    }
}

public class TestClass {
    public static void main(String[] args) throws Exception {
        Game g = new Soccer();

        //g.play();
        //Soccer s = (Soccer) g;
        //s.play("addidas"); //invoca al metodo de la Subclase
        //s.play(); // invoca al metodo de la clase Padre
    }
}
