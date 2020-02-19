package com.yoblog.service.impl;

import com.yoblog.mapper.PermissionMapper;
import com.yoblog.pojo.Permission;
import com.yoblog.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 章学魁
 */
@Service("permissionService")
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    PermissionMapper permissionMapper;

    @Override
    public List<Permission> getAll() {
        return permissionMapper.getAll();
    }

    @Override
    public int addPermission(Permission permission) {
        return permissionMapper.addPermission(permission);
    }

    @Override
    public int deletePermission(Integer id) {
        return permissionMapper.deletePermission(id);
    }

    @Override
    public List<Permission> getByRoleId(Integer id) {
        return permissionMapper.getByRoleId(id);
    }
}
