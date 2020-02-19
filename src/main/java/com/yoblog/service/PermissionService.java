package com.yoblog.service;

import com.yoblog.pojo.Permission;

import java.util.List;

/**
 * @Author 章学魁
 */
public interface PermissionService {
    List<Permission> getAll();

    int addPermission(Permission permission);

    int deletePermission(Integer id);

    List<Permission> getByRoleId(Integer id);
}
