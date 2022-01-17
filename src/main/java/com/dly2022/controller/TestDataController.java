package com.dly2022.controller;

import com.dly2022.pojo.TestData;
import com.dly2022.service.TestDataService;
import com.dly2022.vo.TestUser;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String hello() {
        return "hello spring mvc";
    }

    @RequestMapping("/testJSON")
    public Map<String, Object> index() {
        Map<String, Object> map = new HashMap<>();
        map.put("code",0);
        map.put("msg","");
        map.put("count",10000);
        ArrayList<TestUser> listObj = new ArrayList<>();
        TestUser testData = null;
        for (int i = 0; i < 10; i++) {
            testData = new TestUser();
            testData.setId("10001"+i);
            testData.setUsername("李白"+i);
            testData.setEmail("112233"+i+"@lookup.com");
            testData.setSex("男");
            testData.setCity("四川成都");
            listObj.add(testData);
        }
        map.put("data", listObj);
        return map;
    }

    @RequestMapping("/selectById")
    public List<TestData> selectById() {
        return testDataService.selectById();
    }
}
