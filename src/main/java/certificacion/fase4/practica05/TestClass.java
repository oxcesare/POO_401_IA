package certificacion.fase4.practica05;

public class TestClass {
    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();

        if(obj2.equals(obj1)) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
