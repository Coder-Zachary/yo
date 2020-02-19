package com.yoblog.service;

import com.yoblog.pojo.Role;

import java.util.List;

/**
 * @Author 章学魁
 */
public interface RoleService {
    List<Role> getAll();

    int addRole(Role role);

    int deleteRole(Integer id);

    List<Role> getByAdminId(Integer id);
}
