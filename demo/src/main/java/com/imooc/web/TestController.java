package com.imooc.web;

import com.imooc.service.HKBillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Autowired
    private HKBillsService hKBillsService;


    @RequestMapping("/mybatis")
    @ResponseBody
    public String mybatis(){
        List<String> strList =  hKBillsService.listShowNames();
        return  strList.get(0);
    }

}
