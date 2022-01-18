package com.dly2022.controller;

import com.dly2022.service.UserService;
import com.dly2022.vo.UserVO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ymf
 * Date: 2022/01/18 19:10
 * Description:
 * Version: V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {
   @Resource
   private UserService userService;
   @PostMapping("login")
    public Map<String, Object> login(@RequestBody UserVO userVO){
       return userService.login(userVO);
   }
}
