package certificacion.fase12.practica02;


interface Bozo {
    int type = 0;

    public void jump();
}

public class Type1Bozo implements Bozo {

    private int y;

    public Type1Bozo(int x) {
        //las Variables en una interface son finales y por lo tanto no pueden
        //modificar su valor
        y = type + x;
    }


    @Override
    public void jump() {
        System.out.println("Jumping");
    }

    public static void main(String[] args) {
        Type1Bozo bozo = new Type1Bozo(10);
        bozo.jump();
        System.out.println("bozo.y" + ", " + bozo.y);
        System.out.println("bozo.type" + ", " + bozo.type);
    }
}
