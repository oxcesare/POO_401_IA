package unidad3.figuras;

public class RectanguloV2  extends FiguraGeometrica {
    private double base;
    private double altura;

    public RectanguloV2() {
        super("Rectángulo");
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return getBase() * getAltura();
    }
}