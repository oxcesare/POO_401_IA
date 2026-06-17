package certificacion.fase9.practica05;

import java.io.IOException;

public class TestClass {

    public static void main(String[] args)  {
        try{
            PortConnector pc = new PortConnector();
        }catch(IOException re){
            re.printStackTrace();
        }
    }
}

class PortConnector{

    public PortConnector() throws IOException{
        if(Math.random()>0.5){
            throw new IOException();
        }
        throw new RuntimeException();
    }

}
