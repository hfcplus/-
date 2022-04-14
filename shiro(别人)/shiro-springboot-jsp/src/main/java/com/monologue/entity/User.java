package com.monologue.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Monologue_zsj on 2021/3/7 15:52
 * Author：小脸儿红扑扑
 * Description：
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User implements Serializable {

    private Integer id;
    private String username;
    private String password;
    private String salt;

    //定义角色集合
    private List<Role> roles;


}
