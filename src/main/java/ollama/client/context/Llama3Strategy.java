package ollama.client.context;

import ollama.client.OllamaClient;
import ollama.client.strategy.InteligenciaArtificialStrategy;
import ollama.client.prompting.engine.PromptBuilder;
import ollama.client.prompting.engine.PromptConfig;

public class Llama3Strategy implements InteligenciaArtificialStrategy {

    private final OllamaClient cliente = new OllamaClient();

    @Override
    public String generarRespuesta(PromptConfig config) {

        //Determinar el Prompt seleccionado
        String promptSeleccionado="";

        //Swtich para determinar el tipo de prompt de acuerdo al valor del objeto config
        switch (config.getTipoPrompt()) {
            case "zero-shot":
                promptSeleccionado = new PromptBuilder()
                        .conRol(config.getRol())
                        .conInstrucciones(config.getInstrucciones())
                        .conEntrada(config.getEntrada())
                        .build();
                break;
            case "few-shot":
                // Aquí podrías agregar ejemplos al prompt para few-shot
                promptSeleccionado = new PromptBuilder()
                        .conRol(config.getRol())
                        .conInstrucciones(config.getInstrucciones())
                        .agregarEjemplo("¿Qué es el patrón Strategy?", "El patrón Strategy es un patrón de diseño que permite definir una familia de algoritmos, encapsular cada uno de ellos y hacerlos intercambiables. Permite que el algoritmo varíe independientemente de los clientes que lo utilizan.")
                        .agregarEjemplo("¿Para qué sirve el patrón Strategy?", "El patrón Strategy se utiliza para evitar la proliferación de condicionales en el código, permitiendo que diferentes algoritmos puedan ser seleccionados en tiempo de ejecución sin modificar el código cliente.")
                        .conEntrada(config.getEntrada())
                        .build();
                break;
            default:
                // Si no se especifica un tipo válido, usamos zero-shot por defecto
                promptSeleccionado = new PromptBuilder()
                        .conRol(config.getRol())
                        .conInstrucciones(config.getInstrucciones())
                        .conEntrada(config.getEntrada())
                        .build();
        }



        // 2. Enviamos la petición real al modelo Llama3 instalado
        String jsonRespuesta = cliente.enviarPeticion("llama3", promptSeleccionado);

        // Tip para los alumnos: Aquí deberían usar Jackson/Gson para extraer solo el campo "response"
        return "Respuesta de Ollama: " + jsonRespuesta;
    }

    @Override
    public String getNombreModelo() {
        return "Llama3-Local-M4";
    }
}