package Entity;

import java.util.Date;

public class Vehicle extends Destination {
    private String type;
    private int vehicle_ID;
    private double mileage;
    private String lastServiceDate;
    private String damage;
    private String status;
    private int plate;

    public Vehicle(String typ, int vehicleID, double mile, Date lastServDate, String dmg, String stat, int plat) {
        //super(zip_code);
        type = "VolvoTruck";
        vehicle_ID = 23;
        mileage = 45380.0;
        lastServiceDate = "16-03-2020";
        damage = "Paint cracks";
        status = "Daily use";
        plate = 3305923;
    }

    public String getType() {
        return type;
    }

    public int getVehicle_ID() {
        return vehicle_ID;
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

    public void setType(String typ) {
        type = typ;
    }

    public void setVehicle_ID(int vehicleID)
    {
        vehicle_ID = vehicleID;
    }

    public void setMileage(double mile)
    {
        mileage = mile;
    }

    public void setLastServiceDate(String Date)
    {
        lastServiceDate = Date;
    }

    public void setDamage(String dmg)
    {
        damage = dmg;
    }

    public void setStatus(String stat)
    {
        status = stat;
    }

    public void setPlate(int plat)
    {
        plate = plat;
    }

}

