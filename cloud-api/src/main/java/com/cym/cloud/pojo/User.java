package com.cym.cloud.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息
 */
@Data
@NoArgsConstructor
@TableName("user")
public class User implements Serializable {


    private static final long serialVersionUID = 5110394231929556345L;
    private Integer id;
    private String name;
    private String phone;
    private String address;
    private Integer integral;

}
