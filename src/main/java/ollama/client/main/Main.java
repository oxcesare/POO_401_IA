package ollama.client.main;

import ollama.client.context.AgenteConversacional;
import ollama.client.context.Llama3Strategy;
import ollama.client.intent.routing.IntentRouter;
import ollama.client.prompting.engine.PromptConfig;

public class Main {

    public static void main(String[] args) {

        AgenteConversacional miAgente = new AgenteConversacional();
        IntentRouter router = new IntentRouter();

        // Lo que el usuario realmente quiere
        String loQuePidioElUsuario = "Explica el patrón Strategy de forma sencilla";

        // El Router hace su magia basada en el texto del usuario
        String rolDetectado = router.determinarRol(loQuePidioElUsuario);
        String instruccionesMejoradas = router.optimizarInstrucciones(loQuePidioElUsuario);

        // Ahora construyes tu objeto PromptConfig con datos inteligentes, no fijos
        PromptConfig miPrompt = new PromptConfig(
                rolDetectado,
                instruccionesMejoradas,
                "Explícamelo como experto en el área" // La pregunta específica
        );

        Llama3Strategy miLlama = new Llama3Strategy();
        miAgente.setModelo(miLlama);

        miAgente.interactuar(miPrompt);

    }

    public void version1AgenteConversacional() {

        AgenteConversacional miAgente = new AgenteConversacional();

        // 1. Configuramos la estrategia de Llama3 (que ya tiene el cliente HTTP)
        Llama3Strategy miLlama = new Llama3Strategy();
        miAgente.setModelo(miLlama);

        // Creamos el "objeto para el prompt" con la configuración deseada
        PromptConfig miPrompt = new PromptConfig(
                "Arquitecto de Software Senior",
                "Explica el patrón Strategy de forma sencilla",
                "¿Qué es y para qué sirve?"
        );

        // 2. Configuramos la instrucción específica (Aquí se manda a llamar)
        // El usuario solo manda un texto simple, la arquitectura se encarga del resto
        System.out.println("--- Iniciando conversación con IA Local ---");
        miAgente.interactuar(miPrompt);

        System.out.println("--- Fin de la interacción ---");
    }

}
