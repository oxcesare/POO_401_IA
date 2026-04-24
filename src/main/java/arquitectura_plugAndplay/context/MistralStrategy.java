package arquitectura_plugAndplay.context;


import arquitectura_plugAndplay.strategy.InteligenciaArtificialStrategy;

public class MistralStrategy implements InteligenciaArtificialStrategy {

    @Override

    public String generarRespuesta(String prompt) {

        return "[Mistral-Ollama]: Respuesta rápida generada para: " + prompt;

    }

    @Override

    public String getNombreModelo() { return "Mistral"; }

}

