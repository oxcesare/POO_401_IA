package certificacion.fase12.practica03;

interface IInt{
    int theValue=0;
}

public class Sample implements  IInt {
    public static void main(String[] args) {
        Sample s=new Sample();
        int j = s.theValue;

    }
}
