package certificacion.fase16.practica01;

public class TrimeSet {
    public static void main(String[] args) {
        String blank = " "; // el espacio en blanco cuenta como elemento
        System.out.println(blank.length());

        String line = blank + "hello"+ blank + blank;
        System.out.println(line.length());

        line.concat("world");
        System.out.println(line.length());

        String newLine = line.trim();
        System.out.println(newLine.length());

        System.out.println((int)(line.length()+newLine.length()));
    }
}
