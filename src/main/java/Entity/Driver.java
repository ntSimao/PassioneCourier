package Entity;
import java.util.Date;

public class Driver {
    private int driver_ID;
    private String name, license, mobile, email, address, userName, password;
    private boolean income;
    private Date DOB;

    private Driver(driverBuild builder) {
        this.address = builder.address;
        this.DOB = builder.DOB;
        this.driver_ID = builder.driver_ID;
        ;
        this.email = builder.email;
        this.income = builder.income;
        this.license = builder.license;
        this.mobile = builder.mobile;
        this.name = builder.name;
        this.password = builder.password;
        ;
        this.userName = builder.userName;
    }


    public int getDriver_ID() {
        return driver_ID;
    }

    public String getName() {
        return name;
    }

    public String getLicense() {
        return license;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public boolean isIncome() {
        return income;
    }

    public Date getDOB() {
        return DOB;
    }

    private void fillLog() {

    }

    @Override
    public String toString() {
        return "Driver{" +
                "driver_ID=" + driver_ID +
                ", name='" + name + '\'' +
                ", license='" + license + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", income=" + income +
                ", DOB=" + DOB +
                '}';
    }

    public static class driverBuild (Builder builder){
        private int driver_ID;
        private String name, license, mobile, email, address, userName, password;
        private boolean income;
        private Date DOB;

        public driverBuild setDriverID(int ID){
            this.driver_ID = ID;
            return this;
        }
        public driverBuild setName(String name){
            this.name = name;
            return this;
        }
        public driverBuild setLicense(String license){
            this.license = license;
            return this;
        }
        public driverBuild setMobile(String mobile){
            this.mobile = mobile;
            return this;
        }
        public driverBuild setEmail(String email){
            this.email = email;
            return this;
        }
        public driverBuild setAddress(String address){
            this.address = address;
            return this;
        }
        public driverBuild setUserName(String userName){
            this.userName = userName;
            return this;
        }
        public driverBuild setPassword(String password){
            this.password = password;
            return this;
        }
        public driverBuild setIncome(boolean income){
            this.income = income;
            return this;
        }
        public driverBuild setDateofBirth(Date DOB){
            this.DOB = DOB;
            return this;
        }

        public driverBuild(int ID, String name, String license, String mobile, String email, String address, String userName, String password, boolean income, Date DOB){
            this.driver_ID = ID;
            this.name = name;
            this.license = license;
            this.mobile = mobile;
            this.email = email;
            this.address = address;
            this.userName = userName;
            this.password = password;
            this.income = income;
            this.DOB = DOB;
        }

        public driverBuild copy(Driver driver){
            this.driver_ID = driver.driver_ID;
            this.name = driver.name;
            this.license = driver.license;
            this.mobile = driver.mobile;
            this.email = driver.email;
            this.address = driver.address;
            this.userName = driver.userName;
            this.password = driver.password;
            this.income = driver.income;
            this.DOB = driver.DOB;
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }




    }
}



