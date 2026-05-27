package certificacion.fase2.practica06;

public class EjemploObjetos {
    public static void main(String[] args) {

    }

    public Object getObject(Object a){ //0
        Object b = new Object();  //XXX
        Object c,d = new  Object();
        c = b; //2
        b = a = null; //3
        return c; //4 c sigue siendo un objeto referenciado
    }


    /*
        Después de que el método termine y ya no exista ninguna
        referencia al objeto en el código que recibió el valor retornado.
     */

    //after wich line will the object created at line XXX
    // be eligible for garbage collection?
}
