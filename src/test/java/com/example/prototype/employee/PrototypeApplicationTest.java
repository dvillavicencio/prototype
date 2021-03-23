package com.example.prototype.employee;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
class PrototypeApplicationTest {

    @Autowired
    private EmployeeController controller;

    @Test
    public void contextLoads() throws Exception{
        assertThat(controller).isNotNull();
    }

}