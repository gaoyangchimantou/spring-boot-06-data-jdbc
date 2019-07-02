package com.atguigu.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @Autowired
    JdbcTemplate jdbcTemplate;
    @ResponseBody
    @RequestMapping("/findAllDep")
    public Map<String, Object> findAllDep(){
        //Map<String, Object> map = jdbcTemplate.queryForMap("SELECT * FROM department");
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT * FROM department");
        return list.get(0);
    }



}
