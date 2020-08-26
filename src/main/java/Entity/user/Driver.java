package Entity.user;

import java.time.LocalDate;
import java.util.Date;

public class Driver {

    private int driver_ID;
    private String name,license,mobile,email,address,userName,password;
    private double income;
    private LocalDate DOB;

    private Driver(DriverBuilder builder){
        this.driver_ID = builder.driver_ID;
        this.name = builder.name;
        this.license = builder.license;
        this.mobile = builder.mobile;
        this.email = builder.email;
        this.address = builder.address;
        this.userName = builder.userName;
        this.password = builder.password;

    }

    private void fillLog(){
        //need more clarification on what this method does
    }

    //getters
    private int getDriver_ID() {
        return driver_ID;
    }

    private String getName() {
        return name;
    }

    private String getLicense() {
        return license;
    }

    private String getMobile() {
        return mobile;
    }

    private String getEmail() {
        return email;
    }

    private String getAddress() {
        return address;
    }

    private String getUserName() {
        return userName;
    }

    private String getPassword() {
        return password;
    }
    private LocalDate getDOB () {
        return DOB;
    }
    private double isIncome () {
        return income;
    }

    public static class DriverBuilder

    {
        private int driver_ID;
        private String name,license,mobile,email,address,userName,password;
        private double income;
        private Date DOB;

        private DriverBuilder setName(String name){
            this.name = name;
        return this;}

        private DriverBuilder setDriver_ID(int driver_ID) {
            this.driver_ID = driver_ID;
        return this;}

        private DriverBuilder setLicense(String license) {
            this.license = license;
        return this;}

        private DriverBuilder setMobile(String mobile) {
            this.mobile = mobile;
        return this;}

        private DriverBuilder setEmail(String email) {
            this.email = email;
        return this;}

        private DriverBuilder setUserName(String userName) {
            this.userName = userName;
        return this;}

        private DriverBuilder setPassword (String password){
        this.password = password;
        return this;}

    private DriverBuilder setIncome (double income){
        this.income = income;
        return this;}

        private DriverBuilder setDOB (Date DOB){
        this.DOB = DOB;
        return this;}


        public DriverBuilder(){
        }

    public DriverBuilder(int driver_id,String name,String license, String mobile,
                         String email,String address, String userName,String password)
    {
           this.driver_ID = driver_id;
           this.name = name;
           this.license = license;
           this.mobile = mobile;
           this.email = email;
           this.address = address;
           this.userName = userName;
           this.password = password;
    }
    public DriverBuilder copy(Driver driver){
        this.driver_ID = driver.driver_ID;
        this.name = driver.name;
        this.license = driver.license;
        this.mobile = driver.mobile;
        this.email = driver.email;
        this.address = driver.address;
        this.userName = driver.userName;
        this.password = driver.password;


        return this;}
        public Driver build(){

        return new Driver(this);
        }
    }
}
