package certificacion.fase14.practica09;

public class Sample {
    public static void main(String[] args) {
        String s1 = new String("java");
        StringBuilder s2 = new StringBuilder("java");
        replaceString(s1);
        //el objeto s2 si sufre modificaciones porque no es inmutable
        // caso contrario s1 ahí se tendría que crear otro objeto y para modificar el valor del
        //objeto base
        replaceStringBuilder(s2);
        System.out.println(s1+s2);

    }

    static void replaceString(String s){
        s = s.replace("j", "l");
    }

    static void replaceStringBuilder(StringBuilder s){
        s.append("c");
    }
}
