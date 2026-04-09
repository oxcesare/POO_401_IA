package unidad2.procesamiento;

import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;

public class ProcesadorCifradoIA extends ProcesadorNLP {

    /**
     * Divide por caracteres individuales para un cifrado granular
     * @return
     */
    @Override
    public List<String> tokenizar() {
        return Arrays.asList(getTextoCrudo().split(""));
    }

    /**
     * En seguridad, "limpiar" puede significar normalizar
     * Eliminamos espacios extra para que el hash sea consistente
     */
    @Override
    public void limpiarTexto() {
        String textoLimpio = getTextoCrudo().trim().replaceAll("\\s+", " ");
        setTextoCrudo(textoLimpio);
    }

    /**
     * Simulamos una transformación a Base64 (formato común para enviar a APIs)
     * @return
     */
    @Override
    public Object transformarParaModelo() {
        return Base64.getEncoder().encodeToString(getTextoCrudo().getBytes());
    }
}