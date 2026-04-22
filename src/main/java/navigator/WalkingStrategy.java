package navigator;

public class WalkingStrategy implements RouteStrategy {
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculate the best walking route from " + origin + " to " + destination);
    }
}
