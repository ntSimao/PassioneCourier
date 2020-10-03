package com.PassioneCourier.group2.controller.unlabeled;

import com.PassioneCourier.group2.Entity.unlabeled.Route;
import com.PassioneCourier.group2.Factory.unlabeled.RouteFactory;
import org.junit.FixMethodOrder;
import org.junit.Test;
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

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RouteControllerTest {

    private static Route route = RouteFactory.createRoute(4,11,111,222,50,7);

    @Autowired
    private TestRestTemplate restTemplate;
    private String baseURL = "http://localhost:8080/route/";

    @Test
    public void a_create() {
        String url = baseURL + "create";
        System.out.println("URL: " + url);
        ResponseEntity <Route> postResponse = restTemplate.postForEntity(url, route, Route.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());

        System.out.println();
        System.out.println();
        System.out.println("CREATED");
        //System.out.println(postResponse);
        System.out.println(postResponse.getBody());
    }
    @Test
    public void b_read(){
        String url = baseURL + "read/" + route.getRoute_id();
        System.out.println("URL: " + url);
        ResponseEntity <Route> postResponse = restTemplate.getForEntity(url, Route.class);
        assertEquals(route.getRoute_id(), postResponse.getBody().getRoute_id());

        System.out.println();
        System.out.println();
        System.out.println("READ CREATED");
        //System.out.println(postResponse);
        System.out.println(postResponse.getBody());
    }
    @Test
    public void c_update(){
        Route updated = new Route.Builder().copy(route).setDays(555).build();
        String url = baseURL + "update";
        System.out.println("URL: " + url);
        ResponseEntity <Route> postResponse = restTemplate.postForEntity(url, updated, Route.class);
        assertEquals(route.getRoute_id(), postResponse.getBody().getRoute_id());

        System.out.println();
        System.out.println();
        System.out.println("READ UPDATED");
        //System.out.println(postResponse);
        System.out.println(postResponse.getBody());
    }
    @Test
    public void e_delete(){
        String url = baseURL + "delete/" + route.getRoute_id();
        System.out.println("URL: " + url);
        restTemplate.delete(url, route.getRoute_id());
    }

    @Test
    public void d_getAll() {
        String url = baseURL + "all";
        System.out.println("URL: " + url);
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<String> entity = new HttpEntity<>(null, headers);
        ResponseEntity <String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);

        System.out.println();
        System.out.println();
        System.out.println("READ GET ALL");
        //System.out.println(response);
        System.out.println(response.getBody());
    }
}