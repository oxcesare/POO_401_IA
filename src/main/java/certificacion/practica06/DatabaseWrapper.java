package certificacion.practica06;

public class DatabaseWrapper {

    static String url ="jdbc://derby";

    static DatabaseWrapper getDatabase(){
        System.out.println("Getting DB");
        return null;
    }

    public static void main(String[] args) {
        System.out.println(getDatabase().url);
    }
}
