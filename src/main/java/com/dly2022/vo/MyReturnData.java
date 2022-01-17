package com.dly2022.vo;

import com.dly2022.pojo.TestData;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: ymf
 * Date: 2022/01/16 17:01
 * Description:
 * Version: V1.0
 */
public class MyReturnData {
    private int code;
    private String msg;
    private List<TestData> list;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<TestData> getList() {
        return list;
    }

    public void setList(List<TestData> list) {
        this.list = list;
    }
}
