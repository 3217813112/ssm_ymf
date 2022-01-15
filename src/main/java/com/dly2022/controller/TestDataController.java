package com.dly2022.controller;

import com.dly2022.pojo.TestData;
import com.dly2022.service.TestDataService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ymf
 * Date: 2022/01/15 22:49
 * Description:
 * Version: V1.0
 */
@RestController
public class TestDataController {
    @Resource
    private TestDataService testDataService;

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring mvc";
    }

    @RequestMapping("/selectById")
    public List<TestData> selectById(){
        return testDataService.selectById();
    }
}
