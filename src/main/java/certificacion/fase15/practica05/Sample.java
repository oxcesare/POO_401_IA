package certificacion.fase15.practica05;

public class Sample implements IInt {
    public static void main(String[] args) {
        Sample s = new Sample();
        int j = s.theValue;
        int k = IInt.theValue;
        int l = theValue;

        try {
            s.validaModel(-1);
        } catch (ModelException e) {
            System.out.println(e.getMessage());
        }
    }

    public void validaModel(double parametro) throws ModelException {
        if (parametro < 0) {
            throw new ModelException("El parametro no puede ser negativo");
        }
    }
}

interface IInt {
    int theValue = 0;
}