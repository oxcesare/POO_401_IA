package certificacion.fase3.practica03;

public class TestClass {

    //Si es variable final aunque sea de clase la tengo que inicializar
    final boolean x=true;

    public static Integer wiggler (Integer x){
        Integer y = x+10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args) {
        Integer dataWrapper = Integer.valueOf(5);
        Integer result = wiggler(dataWrapper);
        System.out.println(dataWrapper+result);
    }
}
