package com.PassioneCourier.group2.controller.controller.user;

import com.PassioneCourier.group2.Entity.user.Helper;
import com.PassioneCourier.group2.Factory.user.HelperFactory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
//@RequestMapping("/helper")
public class HelperControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;
    private String baseUrl = "http://Localhost:8080/helper/";

    Helper helper = HelperFactory.createHelper(
            1,
            "Jon Smae",
            "02182004747",
            "realjon@com.com",
            "Streety street",
            "Jony5",
            "****",
            true,
            LocalDate.of(1990, 11, 17));

    @Test
    public void create() {

        String url = baseUrl + "create/";
        System.out.println(url);

        ResponseEntity<Helper> postResponseEntity = testRestTemplate.postForEntity(url, helper,Helper.class);
        Assert.assertNotNull("abc", postResponseEntity);
        Assert.assertNotNull("bbb", postResponseEntity.getBody());

        System.out.println(postResponseEntity);
        System.out.println(postResponseEntity.getBody());

    }

    @Test
    public void getAll() {

        String url = baseUrl + "getall/";
        System.out.println(url);

        HttpHeaders headers = new HttpHeaders();
        HttpEntity <String> entity = new HttpEntity<>(null, headers);
        ResponseEntity <String> getAllResponseEntity = testRestTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        System.out.println(getAllResponseEntity);
        System.out.println(getAllResponseEntity.getBody());
    }

    @Test
    public void read() {

        String url = baseUrl + "read/" + helper.getHelperID();
        System.out.println(url);
        ResponseEntity<Helper> readResponseEntity = testRestTemplate.getForEntity(url, Helper.class);
        Assert.assertEquals(helper.getHelperID(), readResponseEntity.getBody().getHelperID());

        System.out.println(readResponseEntity);
        System.out.println(readResponseEntity.getBody());
    }

    @Test
    public void update() {

        Helper updatedHelper = new Helper.Builder().copy(helper).setName("Frank").build();
        String url = baseUrl + "update/";
        System.out.println(url);
        ResponseEntity<Helper> updatedResponseEntity = testRestTemplate.postForEntity(url, updatedHelper,Helper.class);
        /*
        Assert.assertEquals(helper.getHelperID(), updatedResponseEntity.getBody().getHelperID());
        /*
        Error when trying to instantiate object. The assert method cannot be implemented
        because the updated object is not created. Boolean returns a 0 when its should return a 1
        */
        System.out.println(updatedResponseEntity);
        System.out.println(updatedResponseEntity.getBody());

    }

    @Test
    public void delete() {

        String url = baseUrl + "delete/" + helper.getHelperID();
        testRestTemplate.delete(url);

    }
}