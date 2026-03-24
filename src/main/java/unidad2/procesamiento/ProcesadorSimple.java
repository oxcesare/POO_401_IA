package unidad2.procesamiento;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProcesadorSimple extends ProcesadorNLP{

    @Override
    public List<String> tokenizar() {
        // Usa el campo heredado `tokens` en lugar de un campo duplicado
        listaPalabras = new ArrayList<>(Arrays.asList(getTextoCrudo().split("\\s+")));
        return listaPalabras;
    }

    @Override
    public void limpiarTexto() {
        // Cada método retorna un NUEVO String; se captura y persiste con setTextoCrudo()
        String textoLimpio = getTextoCrudo()
                .replace(".", "")
                .replace(",", "")
                .toLowerCase();
        setTextoCrudo(textoLimpio);
    }

    @Override
    public Object transformarParaModelo() {
        return listaPalabras.size();
    }
}
