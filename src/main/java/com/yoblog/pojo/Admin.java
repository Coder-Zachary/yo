package com.yoblog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

/**
 * @Author 章学魁
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
    private Integer id;
    private String account;
    private String name;
    private String pwd;
    private String avatarUrl;
    private Integer roleId;
    private String creatTime;
    private String modifyTime;
    private List<Role> roles;
}
