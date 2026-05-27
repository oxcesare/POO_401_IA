package certificacion.fase2.practica01;

public class TestLong {

    public static void main(String[] args) {
        String mStr="123";
        //long m = Long.parseLong(mStr);
        long m = Long.valueOf(mStr).longValue();
        //long m = new Long(mStr);
        System.out.println(m);

    }
}
