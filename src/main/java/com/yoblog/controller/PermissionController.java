package com.yoblog.controller;

import com.yoblog.bean.Result;
import com.yoblog.bean.ResultCode;
import com.yoblog.pojo.Permission;
import com.yoblog.service.PermissionService;
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
@RequestMapping("/permissions")
public class PermissionController {
    @Resource
    PermissionService permissionService;

    @GetMapping
    @ApiOperation(value = "获取权限列表")
    public Result getAllPermission() {
        Result result = null;
        List<Permission> permissions = permissionService.getAll();
        if (null != permissions) {
            result = new Result(ResultCode.SUCCESS, permissions);
        } else {
            result = new Result(ResultCode.ERROR, permissions);
        }
        return result;
    }
}
