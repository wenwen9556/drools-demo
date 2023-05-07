package com.example.droolsdemo.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("drools")
public class RuleDO {

    private Long id;
    private String rules;
}
