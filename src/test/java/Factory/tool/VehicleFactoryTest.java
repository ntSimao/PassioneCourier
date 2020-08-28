package Factory.tool;

import Entity.tool.Vehicle;
import org.junit.Assert;
import org.junit.Test;

public class VehicleFactoryTest {

    @Test
    public void createVehicle() {
        Vehicle vehicle = VehicleFactory.createVehicle("DAF FX 106",2729456.00,"16/08/2020",
                "Paint cracks","Excellent", "CA912345");

        Assert.assertEquals(vehicle, vehicle);
        //System.out.println("Details of " + vehicle);

    }
}
