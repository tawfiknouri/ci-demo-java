package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.web.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CiDemoApplicationTests {
    @LocalServerPort
    int port;
    @Autowired
    RestTemplate restTemplate;


    @Test
    public void contextLoads() {
        assertThat(restTemplate.getForObject("http://localhost:" + port, String.class), is("Hello World!"));
    }

}
