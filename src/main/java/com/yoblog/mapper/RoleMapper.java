package com.yoblog.mapper;

import com.yoblog.pojo.Permission;
import com.yoblog.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 章学魁
 */
@Repository
public interface RoleMapper {
    List<Role> getAll();

    int addRole(Role role);

    int deleteRole(Integer id);

    List<Role> getByAdminId(Integer id);
}
