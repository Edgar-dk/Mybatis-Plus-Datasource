package com.example.demo;

import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private UserService userService;

    @Autowired
    private ProductService productService;

    @Test
    public void Test(){
        System.out.println(userService.getById(1));
        System.out.println(productService.getById(1));
    }
}
