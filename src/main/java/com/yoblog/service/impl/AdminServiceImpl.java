package com.yoblog.service.impl;

import com.yoblog.pojo.Admin;
import com.yoblog.mapper.AdminMapper;
import com.yoblog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author 章学魁
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> getAll() {
        return adminMapper.getAll();
    }

    @Override
    public Admin byAccount(String account) {
        return adminMapper.byAccount(account);
    }
}
