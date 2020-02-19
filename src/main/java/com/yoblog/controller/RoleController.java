package com.yoblog.controller;

import com.yoblog.bean.Result;
import com.yoblog.bean.ResultCode;
import com.yoblog.pojo.Role;
import com.yoblog.service.RoleService;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author 章学魁
 */
@RestController
@RequestMapping("/roles")
public class RoleController {
    @Resource
    RoleService roleService;

    @GetMapping
    @ApiOperation(value = "获取角色信息列表")
    public Result getAllRoles() {
        List<Role> roles = roleService.getAll();
        Result result = null;
        if (null != roles) {
            result = new Result(ResultCode.SUCCESS, roles);
        } else {
            result = new Result(ResultCode.ERROR, null);
        }
        return result;
    }
}
