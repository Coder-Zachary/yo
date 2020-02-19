package com.yoblog.mapper;

import com.yoblog.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author 章学魁
 */
@Repository
public interface PermissionMapper {
    List<Permission> getAll();

    int addPermission(Permission permission);

    int deletePermission(Integer id);

    List<Permission> getByRoleId(Integer id);
}
