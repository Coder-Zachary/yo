package com.yoblog.controller;

import cn.hutool.core.util.RandomUtil;
import com.yoblog.bean.Result;
import com.yoblog.bean.ResultCode;
import com.yoblog.utils.EmailUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author 章学魁
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    EmailUtil emailUtil;
    private Map<String, String> codeMap = new LinkedHashMap<String, String>();

    @GetMapping
    public Result sendCode(String email) {
        String code = RandomUtil.randomString(6);
        //emailUtil.sendCode("YO博客注册验证码", code, email);
        codeMap.put(email, code);
        System.out.println(code);
        Result result = new Result(ResultCode.SUCCESS, "验证码发送成功！");
        return result;
    }

    @PostMapping("/code")
    public Result checkCode(String email, String code) {
        Result result = new Result(ResultCode.SUCCESS, "通过验证");
        return result;
    }

}
