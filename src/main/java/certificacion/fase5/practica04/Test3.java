package certificacion.fase5.practica04;

public class Test3 {
    public static void main(String[] args) {

//        for : for(int i=0; i<10; i++){
//            for(int j=0; j<10; j++){
//                if(i+j>10)break for;
//            }
//            System.out.println("Hello");
//        }
//    }

        externo:
        for (int i = 0; i < 10; i++) { // 🟢 "externo" sí es un identificador válido
            for (int j = 0; j < 10; j++) {
                if (i + j > 10) break externo; // 🟢 Rompe el bucle etiquetado
            }
            System.out.println("Hello");
        }
    }
}
