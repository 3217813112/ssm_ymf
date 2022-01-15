package com.dly2022.service;

import com.dly2022.mapper.TestDataMapper;
import com.dly2022.pojo.TestData;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ymf
 * Date: 2022/01/15 22:44
 * Description:
 * Version: V1.0
 */
@Service
public class TestDataService {

    @Resource
    private TestDataMapper testDataMapper;

    public List<TestData> selectById(){
        return testDataMapper.selectById();
    }
}
