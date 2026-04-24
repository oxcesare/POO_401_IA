package arquitectura_plugAndplay.context;

import arquitectura_plugAndplay.strategy.InteligenciaArtificialStrategy;

public class Phi3Strategy  implements InteligenciaArtificialStrategy {

    @Override
    public String generarRespuesta(String prompt) {
        return "[Phi3-Ollama]: Procesando con 16B parámetros... " + prompt;
    }

    @Override
    public String getNombreModelo() {
        return "Phi3";
    }
}
