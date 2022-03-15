package com.sample.microservice.awsdynamodb.web;


import com.sample.microservice.awsdynamodb.domain.Member;
import com.sample.microservice.awsdynamodb.exception.DataNotFoundException;
import com.sample.microservice.awsdynamodb.service.MemberService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/member")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }


    @GetMapping()
    public List<Member> all() {
        return memberService.getAll();

    }

    @PostMapping()
    public Member save(@RequestBody Member member) {
        return memberService.create(member);
    }

    @PutMapping(value = "/{id}")
    public Member update(@PathVariable("id") String id, @RequestBody Member member) {
        return memberService.update(member,id);
    }

    @GetMapping("/{id}")
    public Member getMemberById(@PathVariable(value = "id") String id) {
        return memberService.getById(id).orElseThrow(() -> new DataNotFoundException("not found"));
    }
    @DeleteMapping("/{id}")
    public void deleteMember(@PathVariable(value = "id") String id) {
        memberService.delete(id);
    }

}
