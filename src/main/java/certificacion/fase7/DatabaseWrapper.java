package certificacion.fase7;

public class DatabaseWrapper {

    static String url = "jdbc:mysql://localhost:3306/certificacion";

    public static void main(String[] args) {

        System.out.println(getDatabase().url);

    }

    static DatabaseWrapper getDatabase() {
        System.out.println("Getting DB");
        return null;
    }

}
