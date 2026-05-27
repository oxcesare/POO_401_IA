package certificacion.fase2.practica09;

public class Hilo extends Thread {

    @Override
    public void run() {
        System.out.println("Sobre escribes el metodo run");
    }
}

class OtroHilo implements  Runnable
{


    @Override
    public void run() {
        System.out.println("implementas el metodo run");
    }
}
