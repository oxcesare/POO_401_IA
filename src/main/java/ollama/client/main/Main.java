package ollama.client.main;

import ollama.client.context.AgenteConversacional;
import ollama.client.context.Llama3Strategy;
import ollama.client.template.PromptConfig;

public class Main {

    public static void main(String[] args) {

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
