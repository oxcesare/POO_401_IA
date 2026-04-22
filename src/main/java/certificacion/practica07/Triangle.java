package certificacion.practica07;

public class Triangle {

    public int base;
    public int height;
    public double area;

    //Constructor con 2 parametros
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
        //es valido invocar un metodo dentro del constructor
        updateArea();
    }

    void updateArea() {
        area = base * height / 2;
    }

    public void setBase(int b) {
        base = b;
        updateArea();
    }

    public void setHeight(int h) {
        height = h;
        updateArea();
    }

    //The above class need to protect an invariant on the "area" field
    //Which three members must have the public access  modifiers  removed to ensure
    //that the invariant is maintained

}
