package com.sample.microservice.awsdynamodb.web;

import com.sample.microservice.awsdynamodb.domain.Member;
import com.sample.microservice.awsdynamodb.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/hello")
public class helloController {



    @GetMapping()
    public String hello() {
        return "hello duarte@!";

    }
}
