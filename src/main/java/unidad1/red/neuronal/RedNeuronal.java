package unidad1.red.neuronal;

public class RedNeuronal {

    private String version;

    RedNeuronal(String version) {
        this.version = version;
    }

    public static void main(String[] args) {

        RedNeuronal red = new RedNeuronal("1.0");
        RedNeuronal red2 = new RedNeuronal("2.0");
        RedNeuronal red3 = new RedNeuronal("3.0");
        System.out.println("Red Neuronal versión: " + red.version);
        System.out.println("Red Neuronal versión: " + red2.version);
        System.out.println("Red Neuronal versión: " + red3.version);


    }
}
