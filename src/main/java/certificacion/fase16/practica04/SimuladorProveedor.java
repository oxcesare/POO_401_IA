package certificacion.fase16.practica04;

import java.util.UUID;
import java.util.function.Supplier;

// 1. El objeto que representará nuestra credencial de acceso
class TokenSeguridad {
    String valor;
    long timestampCreacion;

    TokenSeguridad(String valor) {
        this.valor = valor;
        this.timestampCreacion = System.currentTimeMillis();
    }

    @Override
    public String toString() {
        return "Token{Valor: '" + valor + "', Creado en ms: " + timestampCreacion + "}";
    }
}

public class SimuladorProveedor {
    public static void main(String[] args) {

        // 2. Definición del Supplier<T>
        // T = TokenSeguridad (No recibe nada, fabrica un TokenSeguridad)
        Supplier<TokenSeguridad> fabricarToken = () -> {
            // Usamos UUID de Java para generar una cadena aleatoria única e irrepetible
            String idAleatorio = UUID.randomUUID().toString().substring(0, 8);
            return new TokenSeguridad("TOKEN-AI-" + idAleatorio.toUpperCase());
        };

        System.out.println("--- Solicitando Tokens al Supplier ---");

        // 3. Cada vez que invocamos a .get(), se ejecuta la lógica y nace un objeto nuevo
        TokenSeguridad primerAcceso = fabricarToken.get();
        System.out.println("Primer token emitido:  " + primerAcceso);

        // Simulamos una pequeña pausa de milisegundos
        try { Thread.sleep(50); } catch (InterruptedException e) { }

        TokenSeguridad segundoAcceso = fabricarToken.get();
        System.out.println("Segundo token emitido: " + segundoAcceso);
    }
}