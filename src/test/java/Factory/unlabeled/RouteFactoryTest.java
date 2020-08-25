package Factory.unlabeled;

import Entity.unlabeled.Route;
import org.junit.Test;

import static org.junit.Assert.*;

public class RouteFactoryTest {

    @Test
    public void createRoute() {
        Route r = RouteFactory.createRoute(1, 555, 7, 8, 50, 9);
        System.out.println("CREATED: " + r);
    }
}