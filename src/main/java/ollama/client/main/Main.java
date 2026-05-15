package ollama.client.main;

import ollama.client.context.AgenteConversacional;
import ollama.client.context.Llama3Strategy;
import ollama.client.intent.routing.IntentRouter;
import ollama.client.prompting.engine.PromptConfig;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        AgenteConversacional miAgente = new AgenteConversacional();
        IntentRouter router = new IntentRouter();

        Scanner sc = new Scanner(System.in);

        try {
            // Lo que el usuario realmente quiere
            String loQuePidioElUsuario = sc.nextLine();

            // El Router hace su magia basada en el texto del usuario
            String rolDetectado = router.determinarRol(loQuePidioElUsuario);
            String instruccionesMejoradas = router.optimizarInstrucciones(loQuePidioElUsuario);
            String tipoPrompt = router.determinarTipoPrompt(rolDetectado, instruccionesMejoradas);
            List<String> listaEjemplos = new ArrayList<>();

            if (tipoPrompt.equals("few-shot")) {
                String agregarEjemplo;
                do {
                    System.out.println("¿Quieres agregar un ejemplo? (sí/no)");
                    agregarEjemplo = sc.nextLine().trim().toLowerCase();
                    if (agregarEjemplo.equals("si")) {
                        System.out.println("Escribe el ejemplo:");
                        String ejemplo = sc.nextLine();
                        listaEjemplos.add(ejemplo);
                    }
                } while (agregarEjemplo.equals("sí") || agregarEjemplo.equals("si"));
            }

            PromptConfig miPrompt = new PromptConfig(
                    rolDetectado,
                    instruccionesMejoradas,
                    "Explícamelo como experto en el área",
                    tipoPrompt,
                    listaEjemplos
            );

            Llama3Strategy miLlama = new Llama3Strategy();
            miAgente.setModelo(miLlama);

            miAgente.interactuar(miPrompt);

        } catch (Exception e) {
            System.out.println("Ocurrió un error al procesar la entrada: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
    public void version2AgenteConversacional() {
        AgenteConversacional miAgente = new AgenteConversacional();
        IntentRouter router = new IntentRouter();

        // Lo que el usuario realmente quiere
        String loQuePidioElUsuario = "Explica el patrón Strategy de forma sencilla";

        String ejemplo = "Considera este código de ejemplo";

        // El Router hace su magia basada en el texto del usuario
        String rolDetectado = router.determinarRol(loQuePidioElUsuario);
        String instruccionesMejoradas = router.optimizarInstrucciones(loQuePidioElUsuario);
        String tipoPrompt = router.determinarTipoPrompt(rolDetectado, instruccionesMejoradas);

        List<String> listaEjemplos = new ArrayList<>();
        listaEjemplos.add(ejemplo);


        // Ahora construyes tu objeto PromptConfig con datos inteligentes, no fijos
        PromptConfig miPrompt = new PromptConfig(
                rolDetectado,
                instruccionesMejoradas,
                "Explícamelo como experto en el área",
                tipoPrompt, // La pregunta específica
                listaEjemplos

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


        List<String> listaEjemplos = new ArrayList<>();
        listaEjemplos.add("considera el siguiente ejemplo");


        // Creamos el "objeto para el prompt" con la configuración deseada
        PromptConfig miPrompt = new PromptConfig(
                "Arquitecto de Software Senior",
                "Explica el patrón Strategy de forma sencilla",
                "¿Qué es y para qué sirve?", "few-shot",
                listaEjemplos

        );

        // 2. Configuramos la instrucción específica (Aquí se manda a llamar)
        // El usuario solo manda un texto simple, la arquitectura se encarga del resto
        System.out.println("--- Iniciando conversación con IA Local ---");
        miAgente.interactuar(miPrompt);

        System.out.println("--- Fin de la interacción ---");
    }

}
