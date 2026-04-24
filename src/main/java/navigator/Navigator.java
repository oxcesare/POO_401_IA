package navigator;

import java.util.Scanner;

public class Navigator {

    public static void main(String[] args) {

        RouteStrategy strategy = new RoadStrategy();
        strategy.buildRoute("New York", "Los Angeles");

        strategy = new PublicTransportStrategy();
        strategy.buildRoute("New York", "Los Angeles");

        strategy = new WalkingStrategy();
        strategy.buildRoute("New York", "Los Angeles");

        strategy = new AirPlaneStrategy();
        strategy.buildRoute("New York", "Los Angeles");


        //Solicitar al usuario que seleccione el tipo  de navegacion
        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione el tipo de navegación: 1. Road, 2. Public Transport, 3. Walking, 4. AirPlane");
        int option = sc.nextInt();


        switch (option) {
            case 1:
                strategy = new RoadStrategy();
                break;
            case 2:
                strategy = new PublicTransportStrategy();
                break;
            case 3:
                strategy = new WalkingStrategy();
                break;
            case 4:
                strategy = new AirPlaneStrategy();
                break;
            default:
                System.out.println("Opción no válida. Usando RoadStrategy por defecto.");
                strategy = new RoadStrategy();
        }
    }
}
