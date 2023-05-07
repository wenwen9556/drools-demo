package com.example.droolsdemo.controller;

import com.example.droolsdemo.mapper.RuleMapper;
import com.example.droolsdemo.pojo.RuleDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/drools")
public class DroolsController {

    @Autowired
    RuleMapper ruleMapper;

    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping("testdb")
    public RuleDO testdb() {
        return ruleMapper.selectById(1);
    }

}
