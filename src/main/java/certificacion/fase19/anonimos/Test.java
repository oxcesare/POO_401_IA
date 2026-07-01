package certificacion.fase19.anonimos;

public class Test {
    public static void main(String[] args) {

        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola mundo");
            }
        };
    }

    //implementacion mediante interfaces funcionales
    public void demo(){
        Runnable r = () -> System.out.println("Hola mundo");
    }
}
