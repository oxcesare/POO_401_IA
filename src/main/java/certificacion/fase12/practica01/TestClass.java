package certificacion.fase12.practica01;

class ABCD {
    int x = 10;
    static int y = 20;
}

class MNNOP extends ABCD {
    int x = 30;
    static int y = 40;

    public void m(){
        int d = this.x+ this.y;
        System.out.println(d);
    }
}

public class TestClass {

    public static void main(String[] args) {
        System.out.println(new MNNOP().x + ", " + new MNNOP().y);
        ABCD abcd = new ABCD();
        System.out.println(abcd.x + ", " + abcd.y);
    }
}
