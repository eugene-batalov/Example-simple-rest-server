package org.example.controller;

import org.example.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SimpleControllerTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    UserRepository repository;

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testHome() throws Exception {
        String body = this.restTemplate.getForObject("/", String.class);
        assertThat(body).isEqualTo("Hello World!");
    }

    @Test
    public void testUser() throws Exception {

    }

    @Test
    public void testUserFrom() throws Exception {

    }

    @Test
    public void testUserAll() throws Exception {

    }

}