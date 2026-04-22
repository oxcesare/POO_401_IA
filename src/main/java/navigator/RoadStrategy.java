package navigator;

public class RoadStrategy implements  RouteStrategy{
    @Override
    public void buildRoute(String origin, String destination) {
        System.out.println("Calculate the best road route from " + origin + " to " + destination);
    }
}
