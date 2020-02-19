package com.yoblog.mapper;

import com.yoblog.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 章学魁
 */
@Repository
public interface AdminMapper {
    List<Admin> getAll();

    Admin byAccount(String account);
}
