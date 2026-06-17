package certificacion.fase9.practica07;

public class Test {

    public float parseFloat(String s) {
        float f = 0.0f;
        try {
            f = Float.valueOf(s).floatValue();
            return f;
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
            f = Float.NaN;
            return f;
        } finally {
            System.out.println("Finally");
        }

    }
}
