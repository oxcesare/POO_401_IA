package certificacion.fase15.practica01;

public class TestClass {

    /*
    public Boolean tester() {
        return false;
    }*/

    public boolean tester(){
        return false;
    }

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        int i = 0;
        while (testClass.tester() && i < 10) {
            System.out.println("running....");
            i++;

        }
    }
}
