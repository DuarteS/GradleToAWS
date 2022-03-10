package com.example.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

//@CrossOrigin(origins = "https://master.d3m2jwhbvk1whf.amplifyapp.com")
@RestController
public class HelloController {

    @CrossOrigin
    @GetMapping("/hello")
    public String hello() {
        //helloModel test = new helloModel(1,"test");
        return "test";
    }

}
