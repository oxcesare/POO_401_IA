package certificacion.fase2.practica02;

public class Estaticos {

    {
        System.out.println("1");
    }

    static{
        System.out.println("2");
    }

    public static void main(String[] args) {
        Estaticos e = new Estaticos();
    }
}

