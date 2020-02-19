package com.yoblog.controller;

import com.yoblog.pojo.Admin;
import com.yoblog.bean.Result;
import com.yoblog.bean.ResultCode;
import com.yoblog.service.AdminService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 章学魁
 */
@RestController
@RequestMapping("/admins")
public class AdminController {
    @Resource
    AdminService adminService;

    @GetMapping
    @ApiOperation(value = "获取管理员列表")
    public Result getAll() {
        List<Admin> admins = adminService.getAll();
        Result result = new Result(ResultCode.SUCCESS, admins);
        return result;
    }

    @GetMapping("/{account}")
    @ApiOperation(value = "获取管理员信息", notes = "根据url中的管理员account获取管理员详细信息")
    @ApiImplicitParam(name = "account", value = "管理员账号", required = true, dataType = "String")
    public Result getUser(@PathVariable String account) {
        Admin admin = adminService.byAccount(account);
        System.out.println(admin);
        Result result = new Result(ResultCode.SUCCESS, admin);
        return result;
    }


}
