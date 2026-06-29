package certificacion.fase11.practica07;

import java.io.*;


interface A {
    void compute();
    public void c();

    //Una interface no puede tener métodos protected,
    // ya que todos los métodos de una interface son implícitamente public
    // y abstractos. Por lo tanto,
    // no se puede declarar un método como protected en una interface.
    //protected void compute2();
}
class Great{
    public void doStuff() throws  FileNotFoundException{
        System.out.println("doStuff");
    }
}

class Amazing extends Great{
    public void doStuff() throws  IllegalArgumentException, FileNotFoundException{
        System.out.println("doStuff");

        }
    }


public class TestClas {
}
