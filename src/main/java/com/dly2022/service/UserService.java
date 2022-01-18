package com.dly2022.service;

import com.dly2022.mapper.UserMapper;
import com.dly2022.pojo.User;
import com.dly2022.vo.UserVO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ymf
 * Date: 2022/01/18 19:05
 * Description:
 * Version: V1.0
 */
@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public Map<String, Object> login(UserVO userVO) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 501);
        map.put("msg", "用户名或者密码不正确");
        User user = userMapper.login(userVO.getUsername());
        System.out.println("UserService login user=" + user);
        // 如果user返回null，代表用户输入的用户名不存在，则直接返回错误码

        if(user != null && user.getPassword().equals(userVO.getPassword())) {  // 验证用户名存在，并且输入的密码与数据库中密码一致
            map.put("code", 200);
            map.put("msg", "登录成功");
        }
        return map;
    }
}
