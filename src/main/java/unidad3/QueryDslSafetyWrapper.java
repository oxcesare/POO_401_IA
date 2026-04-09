package unidad3;

public class QueryDslSafetyWrapper {

    /*
    // Lista Blanca: Solo estos campos pueden ordenar.
    // Puedes sacarlos de una configuración o anotación.
    private static final Set<String> ALLOWED_FIELDS = Set.of("nombre", "id", "fecha", "codigo");

    public static OrderSpecifier<?> getValidatedOrder(String dtoField, Order direction, EntityPathBase<?> qEntity) {
        // 1. Sanitización básica
        String field = (dtoField == null) ? "id" : dtoField.trim();

        // 2. LA VUELTA AL PROBLEMA: Si el campo no es permitido,
        // NO lanzamos error, usamos un default (id).
        if (!ALLOWED_FIELDS.contains(field)) {
            field = "id";
        }

        // 3. Construcción SEGURA. PathBuilder asegura que el String
        // se trate como un nombre de columna y no como código SQL.
        PathBuilder<?> pathBuilder = new PathBuilder<>(qEntity.getType(), qEntity.getMetadata());

        return new OrderSpecifier(direction, pathBuilder.get(field));
    }*/
}