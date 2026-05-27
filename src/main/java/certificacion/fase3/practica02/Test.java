package certificacion.fase3.practica02;

class MyHilo extends Thread{

    @Override
    public void run() {

    }
}

class MySegundoHilo implements Runnable{

    @Override
    public void run() {
        System.out.println("MySegundoHilo");
    }

}

public class Test {

    public static void main(String[] args) {
        Runnable r = new Thread();
    }
}
