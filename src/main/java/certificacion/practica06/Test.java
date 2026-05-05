package certificacion.practica06;

public class Test {

    public static void main(String[] args) {

    }

    public Object getObject() {

        Object obj = new String("aaaaa");
        Object objectArr[] = new Object[1];
        objectArr[0] = obj;
        obj = null;
        objectArr[0] = null; // hasta este punto la referencia es null
        return obj;
    }
}
