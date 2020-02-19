package com.yoblog.service;

import com.yoblog.pojo.Admin;

import java.util.List;

/**
 * @Author 章学魁
 */
public interface AdminService {
    List<Admin> getAll();

    Admin byAccount(String account);
}
