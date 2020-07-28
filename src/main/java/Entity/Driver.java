package Entity;

public class Driver {
public int driver_ID;
public String name,license,mobile,email,address,userName,password;
public boolean income;
public date DOB;

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

    private date getDOB() {
        return DOB;
    }

    private void setDOB(date DOB) {
        this.DOB = DOB;
    }
    private void fillLog(ProductDriver productDriver){

    }
}
