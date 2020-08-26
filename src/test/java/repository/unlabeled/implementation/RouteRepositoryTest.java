package repository.unlabeled.implementation;

import Entity.tool.Device;
import Entity.unlabeled.Route;
import Factory.tool.DeviceFactory;
import Factory.unlabeled.RouteFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import repository.tool.DeviceRepositoryInterface;
import repository.tool.implementation.DeviceRepository;
import repository.unlabeled.RouteRepositoryInterface;

import static org.junit.Assert.*;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RouteRepositoryTest {

    public static RouteRepositoryInterface myRepo = RouteRepository.getRepository();
    private static Route myRoute = RouteFactory.createRoute(1, 555, 3, 4, 50, 7);

    @Test
    public void a_create() {
        Route created = myRepo.create(myRoute);
        Assert.assertEquals(myRoute.getRoute_id(), created.getRoute_id());
        System.out.println("Created: " + created);
    }

    @Test
    public void b_read() {
        Route read = myRepo.read(myRoute.getRoute_id());
        System.out.println("Read: " + read);
    }

    @Test
    public void c_update() {
        Route updated = new Route.Builder().copy(myRoute).setDays(12).build();
        updated = myRepo.update(updated);
        System.out.println("Updated: " + updated);
    }

    @Test
    public void e_delete() {
        /*Route deleted = myRepo.delete(myRoute.getRoute_id());
        Assert.assertEquals(false, deleted);*/
        myRepo.delete(myRoute.getRoute_id());
        System.out.println("Deleted: " + myRoute.getRoute_id() + ", " + myRoute.getPrice() + ", " + myRoute.getDays());
    }

    @Test
    public void d_getAll() {
        System.out.println("Get all: " + myRepo.getAll());
    }
}