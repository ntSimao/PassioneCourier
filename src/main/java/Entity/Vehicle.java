package Entity;


public class Vehicle {
    private String type;
    private int vehicle_id;
    private double mileage;
    private String lastServiceDate;
    private String damage;
    private String status;
    private int plate;

    public Vehicle(String type, int vehicle_id, double mileage, String lastServiceDate, String damage, String status, int plate) {
        this.type = "VolvoTruck";;
        this.vehicle_id = 23;
        this.mileage = 45380.0;
        this.lastServiceDate = "16-03-2020";;
        this.damage = "Paint cracks";
        this.status = "Daily use";
        this.plate = 33025923;
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
        return "Vehicle{" +
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

        public Vehicle createVehicle() {
            return new Vehicle(type, vehicle_id, mileage, lastServiceDate, damage, status, plate);
        }
}