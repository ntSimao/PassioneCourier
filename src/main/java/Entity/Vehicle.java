package Entity;

public class Vehicle {
<<<<<<< HEAD
    
}
=======
    private String type;
    private int vehicle_id;
    private double mileage;
    private String lastServiceDate;
    private String damage;
    private String status;
    private int plate;

    public Vehicle(String type, int vehicle_id, double mileage, String lastServiceDate, String damage, String status, int plate) {
        this.type = type;
        this.vehicle_id = vehicle_id;
        this.mileage = mileage;
        this.lastServiceDate = lastServiceDate;
        this.damage = damage;
        this.status = status;
        this.plate = plate;
    }

    public String getType() {
        return type;
    }

    public int getVehicle_id() {
        return vehicle_id;
    }

    public double getMileage() {
        return mileage;
    }

    public String getLastServiceDate() {
        return lastServiceDate;
    }

    public String getDamage() {
        return damage;
    }

    public String getStatus() {
        return status;
    }

    public int getPlate() {
        return plate;
    }

    @Override
    public String toString() {
        return "VehicleBuilder{" +
                "type='" + type + '\'' +
                ", vehicle_id=" + vehicle_id +
                ", mileage=" + mileage +
                ", lastServiceDate='" + lastServiceDate + '\'' +
                ", damage='" + damage + '\'' +
                ", status='" + status + '\'' +
                ", plate=" + plate +
                '}';
    }

    public Vehicle setType(String type) {
        this.type = type;
        return this;
    }

    public Vehicle setVehicle_ID(int vehicle_id) {
        this.vehicle_id = vehicle_id;
        return this;
    }

    public Vehicle setMileage(double mileage) {
        this.mileage = mileage;
        return this;
    }

    public Vehicle setLastServiceDate(String lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
        return this;
    }

    public Vehicle setDamage(String damage) {
        this.damage = damage;
        return this;
    }

    public Vehicle setStatus(String status) {
        this.status = status;
        return this;
    }

    public Vehicle setPlate(int plate) {
        this.plate = plate;
        return this;
    }

//    public Vehicle createVehicle() {
//        return new Vehicle(type, vehicle_id, mileage, lastServiceDate, damage, status, plate);
//    }
}
>>>>>>> bbe7b40f69c21664acdf95a74def23bb232d98f2
