package certificacion.fase15.practica01;

public class LoopTest {

    int k=5;

    /**
     * En este metodo recibe como parametro una variable
     * y esa es la que queda dentro del contexto del mismo
     * y por lo tanto no hace uso a la variable de instancia.
     * @param k
     * @return
     */
    public boolean checkIt(int k ){
        return k-- >0? true:false;
    }

    public void printThem(){
        while(checkIt(k)){
            System.out.println(k);
        }
    }


    public static void main(String[] args) {
        new LoopTest().printThem();
    }
}
