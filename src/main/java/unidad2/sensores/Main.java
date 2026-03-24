package unidad2.sensores;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<SensorIA> percepcionHub = new ArrayList<>();

        Percepcion p = new Percepcion();
        p.consumoEnergia=10.00;
        p.modelo="A";

        percepcionHub.add(p);
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
