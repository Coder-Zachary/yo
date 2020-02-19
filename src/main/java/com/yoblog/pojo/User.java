package com.yoblog.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Author 章学魁
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer sex;
    private String email;
    private String password;
    private String avatar_url;
    private String description;
    private String creat_time;
    private String modify_time;
    private Integer status;
    private Integer report_number;
}
