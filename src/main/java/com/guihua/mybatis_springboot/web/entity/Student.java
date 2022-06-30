package com.guihua.mybatis_springboot.web.entity;

import lombok.Data;

/**
 * @version v1.0
 * @ClassName: Student.java
 * @description: 学生实体类
 * @author: haiming.li
 * @createDate: 2021-10-16 19:56
 */
@Data
public class Student {

  private Long id;

  private String userName;

  private String phone;
}
