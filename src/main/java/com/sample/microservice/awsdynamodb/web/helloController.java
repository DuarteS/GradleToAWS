package com.sample.microservice.awsdynamodb.web;

import com.sample.microservice.awsdynamodb.domain.Member;
import com.sample.microservice.awsdynamodb.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hello")
public class helloController {

    @Value("${accesskey}")
    private String dynamodbAccessKey;

    @Value("${secretkey}")
    private String secretkey;

    @Value("${test1}")
    private String secretManagerTest1;

    @Value("${test2}")
    private String secretManagerTest2;

    @Value("${test3}")
    private String secretManagerTest3;

    @GetMapping()
    public String hello() {
        return secretManagerTest3;

    }
}
