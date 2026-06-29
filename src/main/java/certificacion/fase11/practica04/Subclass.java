package certificacion.fase11.practica04;

class SuperClass{

    public SuperClass(int m) {
    }
}
public class Subclass extends SuperClass {

    int i, j,k;
    public Subclass(int m, int n){
        super(m);
        i = m;
        j = n;
    }

    public Subclass(int m){
        super(m);
    }
}
