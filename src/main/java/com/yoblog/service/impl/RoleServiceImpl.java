package com.yoblog.service.impl;

import com.yoblog.mapper.RoleMapper;
import com.yoblog.pojo.Role;
import com.yoblog.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 章学魁
 */
@Service("roleService")
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getAll() {
        return roleMapper.getAll();
    }

    @Override
    public int addRole(Role role) {
        return roleMapper.addRole(role);
    }

    @Override
    public int deleteRole(Integer id) {
        return roleMapper.deleteRole(id);
    }

    @Override
    public List<Role> getByAdminId(Integer id) {
        return roleMapper.getByAdminId(id);
    }
}
