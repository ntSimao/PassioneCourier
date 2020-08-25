package Entity.tool;

public class Vehicle {
    private String type;
    private int vehicle_id;
    private double mileage;
    private String lastServiceDate;
    private String damage;
    private String status;
    private int plate;

    public Vehicle(Vehicle builder) {
        this.type = builder.type;
        this.vehicle_id = builder.vehicle_id;
        this.mileage = builder.mileage;
        this.lastServiceDate = builder.lastServiceDate;
        this.damage = builder.damage;
        this.status = builder.status;
        this.plate = builder.plate;
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
    public static class Builder {

        private String type;
        private int vehicle_id;
        private double mileage;
        private String lastServiceDate;
        private String damage;
        private String status;
        private int plate;
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
        return new Vehicle(this);
    }
}
