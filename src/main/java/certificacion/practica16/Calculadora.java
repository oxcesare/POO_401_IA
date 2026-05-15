package certificacion.practica16;

public class Calculadora {

    public double divide(double p1, double p2) throws CustomException {
        if (p1 == 0) {
            throw new CustomException("El primer parametro no puede ser cero");
        }
        return p1 / p2;
    }

}
