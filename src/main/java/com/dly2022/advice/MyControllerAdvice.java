package com.dly2022.advice;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: ymf
 * Date: 2022/01/18 19:16
 * Description:
 * Version: V1.0
 */
@RestControllerAdvice
public class MyControllerAdvice {
    @ExceptionHandler(NumberFormatException.class)
    public Map<String, Object> checkException01(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 501);
        map.put("msg", "对不起，请输入纯整数数字");
        return map;
    }

    @ExceptionHandler(FileNotFoundException.class)
    public Map<String, Object> checkException02(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 501);
        map.put("msg", "对不起，文件路径没有被找到");
        return map;
    }

    @ExceptionHandler(ArrayIndexOutOfBoundsException.class)
    public Map<String, Object> checkException03(Exception e) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 501);
        map.put("msg", "对不起，数组的下标超界");
        return map;
    }
}
