package Factory.tool;
import Entity.tool.Vehicle;
import java.util.Random;

public class VehicleFactory {
    public static Vehicle createVehicle(String type,double mileage,String lastServiceDate,
                                        String damage,String status,int plate){
        Random rand = new Random();
        int vehicleID = rand.nextInt(518162);

        Vehicle vehicle = new Vehicle.VehicleBuilder().setVehicle_ID(vehicleID).setType(type)
                .setMileage(mileage).setLastServiceDate(lastServiceDate)
                .setStatus(status).setPlate(plate).createVehicle();
        return vehicle;
    }
}
