package unidad2.interfaces.practica04;

public class LLM {


    public LLM(){
        System.out.println("Constructor de la clase");
    }

    public LLM(String modelo,String version){
        System.out.println("Se ejecuto el constructor con parametros");
    }

    public static void main(String[] args) {
        LLM n = new LLM();

        LLM m = new LLM("modelo", "version");
    }


}
