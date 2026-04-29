package ollama.client.context;

import ollama.client.OllamaClient;
import ollama.client.strategy.InteligenciaArtificialStrategy;
import ollama.client.template.PromptBuilder;
import ollama.client.template.PromptConfig;

public class Llama3Strategy implements InteligenciaArtificialStrategy {

    private final OllamaClient cliente = new OllamaClient();

    private String instrucciones = "Responde de forma concisa y técnica.";

    // Método para cambiar el comportamiento en tiempo de ejecución
    public void setInstrucciones(String nuevasInstrucciones) {
        this.instrucciones = nuevasInstrucciones;
    }


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