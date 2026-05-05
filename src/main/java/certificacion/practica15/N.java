package certificacion.practica15;


class M{

}
public class N {
    private M m = new M();

    public void makeItNull(M pM){
        pM= null;
    }


    public void makeThisNull(){
        makeItNull(m);
        // Si m fuera null, esto lanzaría un NullPointerException o imprimiría null
        System.out.println("¿M sigue vivo?: " + (this.m != null));
    }

    public static void main(String[] args) {
        N n = new N();
        n.makeThisNull();
    }

}
