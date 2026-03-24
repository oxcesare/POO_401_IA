package unidad2.procesamiento;

import java.util.*;
import java.util.stream.Collectors;

public class ProcesadorAnalisisSentimiento extends ProcesadorNLP {

    private static final List<String> STOP_WORDS =
            Arrays.asList("el", "la", "un");

    static {
        List<String> palabras =  Arrays.asList("bueno", "excelente", "maravilloso");
    }

    @Override
    public List<String> tokenizar() {
        listaPalabras = new ArrayList<>(
                Arrays.asList(getTextoCrudo().split("\\s+"))
        );
        return listaPalabras;
    }

    @Override
    public void limpiarTexto() {
        // Ahora opera sobre `tokens` que ya fue llenada por tokenizar()
        listaPalabras = listaPalabras.stream()
                .filter(t -> !STOP_WORDS.contains(t.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public Object transformarParaModelo() {
        Map<String, Integer> frecuencia = new HashMap<>();
        for (String token : listaPalabras) {
            if (listaPalabras.contains(token.toLowerCase())) {
                frecuencia.merge(token, 1, Integer::sum);
            }
        }
        return frecuencia.toString();
    }
}
