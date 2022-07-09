package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Edgar
 * @create 2022-07-09 19:06
 * @faction:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tuser")
public class User {
    @TableId
    private Integer uid;
    private String userName;
    private Integer age;
    private String email;
    private Integer sex;
    private Integer isDeleted;
}
