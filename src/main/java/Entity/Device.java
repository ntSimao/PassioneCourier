package Entity;

public class Device {

    //instance variables
    private int device_ID;
    private String type;


    //constructor
    private Device(DeviceBuilder builder) {

        this.device_ID = builder.device_ID;
        this.type = builder.type;

    }

    //getters
    public int getDevice_ID() {
        return device_ID;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Device{" +
                "device_ID=" + device_ID +
                ", type='" + type + '\'' +
                '}';
    }

    public void submitLog() {

    }


    //builder
    public static class DeviceBuilder {

        //instances

        public DeviceBuilder setDeviceID(int devID) {
            this.device_ID = devID;
            return this;
        }

        public DeviceBuilder setDeviceType(String typ) {
            this.type = typ;
            return this;
        }


        public DeviceBuilder(int devID, String typ) {

            this.device_ID = devID;
            this.type = typ;
        }

        public DeviceBuilder copy(Device myDevice) {
            this.device_ID = myDevice.device_ID;
            this.type = myDevice.type;
            return this;
        }

        public Device build() {
            return new Device(this);
        }
    }
}