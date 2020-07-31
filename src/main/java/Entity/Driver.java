package Entity;
import java.util.Date;

public class Driver {
private int driver_ID;
private String name,license,mobile,email,address,userName,password;
private boolean income;
private Date DOB;

    public Driver driverBuild(){
        Driver driver = new Driver();
        driver.address = this.address;
        driver.DOB = this.DOB;
        driver.driver_ID = this.driver_ID;
        driver.email = this.email;
        driver.income = this.income;
        driver.license = this.license;
        driver.mobile = this.mobile;
        driver.name = this.name;
        driver.password = this.password;
        driver.userName = this.userName;

    return driver;}

    //private Driver(Builder builder){
    //not sure what to do here?
    //}
    private Driver(){}


    private void fillLog(ProductDriver productDriver){
        //need more clarification on what this method does
    }

    //getters and setters below
    private int getDriver_ID() {
        return driver_ID;
    }

    private void setDriver_ID(int driver_ID) {
        this.driver_ID = driver_ID;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    private String getLicense() {
        return license;
    }

    private void setLicense(String license) {
        this.license = license;
    }

    private String getMobile() {
        return mobile;
    }

    private void setMobile(String mobile) {
        this.mobile = mobile;
    }

    private String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    private String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    private String getUserName() {
        return userName;
    }

    private void setUserName(String userName) {
        this.userName = userName;
    }

    private String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private boolean isIncome() {
        return income;
    }

    private void setIncome(boolean income) {
        this.income = income;
    }

    private Date getDOB() {
        return DOB;
    }

    private void setDOB(Date DOB) {
        this.DOB = DOB;
    }
}

