package navigator;

public class PublicTransportStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculate the best public transport route from " + origin + " to " + destination);
    }
}
