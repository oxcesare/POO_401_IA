package unidad2.sensores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();
        percepcionHub.add(new Percepcion());
        percepcionHub.add(new SensorUltrasonido());
        percepcionHub.add(new SensorVision());

        for (SensorIA sensor : percepcionHub) {
            sensor.leerDatos();
        }

        /**
         * Implementación Java 8
         */

        percepcionHub.forEach(SensorIA::leerDatos);
    }
}
