package arquitectura_plugAndplay.template;

public class PromptTemplate {
    private String rol;
    private String contexto;
    private String tarea;

    public String build() {
        // Aplicando la técnica de delimitadores recomendada por Claude/Anthropic
        return String.format(
                "<system>\nEres un %s. Contexto: %s\n</system>\n<user>\nTarea: %s\n</user>",
                rol, contexto, tarea
        );
    }

    // metodo para construir el prompt pero utilizando StringBuilder
    public String buildWithStringBuilder() {
        StringBuilder sb = new StringBuilder();
        sb.append("<system>\n");
        sb.append("Eres un ").append(rol).append(". Contexto: ").append(contexto).append("\n");
        sb.append("</system>\n");
        sb.append("<user>\n");
        sb.append("Tarea: ").append(tarea).append("\n");
        sb.append("</user>");
        return sb.toString();
    }

    public static void main(String[] args) {
        PromptTemplate prompt = new PromptTemplate();
        prompt.rol = "experto en inteligencia artificial";
        prompt.contexto = "Tienes experiencia en procesamiento de lenguaje natural y generación de texto.";
        prompt.tarea = "Genera un resumen de las últimas noticias sobre inteligencia artificial.";

        String finalPrompt = prompt.build();
        System.out.println(finalPrompt);
    }

    public StringBuilder buildClasificacionSoportePrompt(String mensajeUsuario) {
        StringBuilder sb = new StringBuilder();
        sb.append("<system>\n");
        sb.append("Eres un asistente experto en clasificación de texto para soporte técnico. ")
                .append("Tu objetivo es analizar el mensaje del usuario y categorizarlo en UNA de las siguientes etiquetas: ")
                .append("[SOPORTE_TECNICO], [FACTURACION], [DEVOLUCIONES], [VENTAS].\n");
        sb.append("</system>\n\n");
        sb.append("<instrucciones>\n");
        sb.append("1. Analiza cuidadosamente el sentimiento y la necesidad del mensaje contenido en la etiqueta <mensaje>.\n");
        sb.append("2. Responde únicamente con el nombre de la categoría en formato JSON.\n");
        sb.append("3. Si no estás seguro, usa la categoría [SOPORTE_TECNICO].\n");
        sb.append("</instrucciones>\n\n");
        sb.append("<mensaje>\n");
        sb.append("\"").append(mensajeUsuario).append("\"\n");
        sb.append("</mensaje>\n\n");
        sb.append("Respuesta:");
        return sb;
    }

}
