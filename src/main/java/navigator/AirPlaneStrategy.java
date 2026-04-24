package navigator;

public class AirPlaneStrategy implements RouteStrategy {

    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculate the best airplane route from " + origin + " to " + destination);

    }
}
