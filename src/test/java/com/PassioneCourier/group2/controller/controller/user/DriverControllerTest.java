package com.PassioneCourier.group2.controller.controller.user;

import com.PassioneCourier.group2.Entity.user.Driver;

import com.PassioneCourier.group2.Factory.user.DriverFactory;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment =  SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)



class DriverControllerTest {

    private static Driver driver = DriverFactory.createDriver("Yaseen","123456","yaseen@gmail.com",
            "0812153431","cape town","yaseen","password",10.00, LocalDate.parse("1999-11-01"));

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseUrl = "http://localhost:3306/passioneCDB";
    private static String USER_NAME = "paco";
    private static String USER_PASSWORD = "user@Pass1oneCour1er";

    @Test
    public void a_create() {
        String url = baseUrl + "create";
        System.out.println("URL: "+url);
        System.out.println("Post date: " +driver);
        ResponseEntity<Driver> postResponse = restTemplate.postForEntity(url,driver,Driver.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
        driver = postResponse.getBody();
        System.out.println("Saved data: "+driver);
        assertEquals(driver.getDriver_ID(),postResponse.getBody().getDriver_ID());
    }

    @Test
    public void d_getAll() {
        String url = baseUrl + "all";
        System.out.println("URL: "+ url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null,headers);
        ResponseEntity <String> getAllResponseEntity = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
        System.out.println(getAllResponseEntity);
        System.out.println(getAllResponseEntity.getBody());
    }

    @Test
    public void b_read() {

        String url = baseUrl + "read/" + driver.getDriver_ID();
        System.out.println(url);
        ResponseEntity<Driver> readResponseEntity = restTemplate.withBasicAuth(USER_NAME,USER_PASSWORD).getForEntity(url, Driver.class);
        Assert.assertEquals(driver.getDriver_ID(), readResponseEntity.getBody().getDriver_ID());

        System.out.println(readResponseEntity);
        System.out.println(readResponseEntity.getBody().getDriver_ID());
    }
    @Test
    public void c_update() {

        Driver updatedDriver = new Driver.DriverBuilder().setName("Yaseen").build();
        String url = baseUrl + "update/";
        System.out.println(url);
        ResponseEntity<Driver> updatedResponseEntity = restTemplate.postForEntity(url, updatedDriver,Driver.class);
        System.out.println(updatedResponseEntity);
        System.out.println(updatedResponseEntity.getBody());

    }

    @Test
    public void e_delete() {

        String url = baseUrl + "delete/" + driver.getDriver_ID();
        restTemplate.delete(url);

    }
}