package certificacion.fase16.practica02;


interface Runner {
    void run();
}


public class Test02 {
    public static void main(String[] args) {

        Runner runner = new Runner() {
            @Override
            public void run() {
                System.out.println("Running...");
            }
        };

        Runner runnerLambda = () -> {
            System.out.println("Running with lambda...");
        };

        runner.run();
        runnerLambda.run();
    }
}
