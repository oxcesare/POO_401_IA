package ollama.client.context;

import ollama.client.OllamaClient;
import ollama.client.strategy.InteligenciaArtificialStrategy;
import ollama.client.prompting.engine.PromptBuilder;
import ollama.client.prompting.engine.PromptConfig;

public class Llama3Strategy implements InteligenciaArtificialStrategy {

    private final OllamaClient cliente = new OllamaClient();

    @Override
    public String generarRespuesta(PromptConfig config) {

        // 1. Construimos el prompt profesional con la técnica elegida
        String promptFinal = new PromptBuilder()
                .conRol(config.getRol())
                .conInstrucciones(config.getInstrucciones())
                .conEntrada(config.getEntrada())
                .build();

        // 2. Enviamos la petición real al modelo Llama3 instalado
        String jsonRespuesta = cliente.enviarPeticion("llama3", promptFinal);

        // Tip para los alumnos: Aquí deberían usar Jackson/Gson para extraer solo el campo "response"
        return "Respuesta de Ollama: " + jsonRespuesta;
    }

    @Override
    public String getNombreModelo() {
        return "Llama3-Local-M4";
    }
}