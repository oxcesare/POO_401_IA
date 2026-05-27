package certificacion.fase2.practica11;

class Super {
    static {
        System.out.println("super ");
    }
}

class One {
    static {
        System.out.println("one ");
    }
}

class Two extends Super {
    static {
        System.out.println("two ");
    }
}

public class Test {

    public static void main(String[] args) {

        One o = null;
        Two t = new Two();

        Long a = Long.parseLong("123");
        Long.valueOf("123").longValue();


    }
}
