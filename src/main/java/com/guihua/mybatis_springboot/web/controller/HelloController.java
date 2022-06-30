package com.guihua.mybatis_springboot.web.controller;

import com.guihua.mybatis_springboot.web.entity.Student;
import com.guihua.mybatis_springboot.web.service.StudentServiceImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version v1.0
 * @ClassName: HelloController.java
 * @description: hello
 * @author: haiming.li
 * @createDate: 2021-10-16 17:24
 */
@RestController
public class HelloController {

  private final StudentServiceImpl studentService;

  public HelloController(StudentServiceImpl studentService) {
    this.studentService = studentService;
  }

  @GetMapping(value = "listStudent")
  public List<Student> listStudentInfo() {
    return studentService.getStudentInfo();
  }

  @GetMapping(value = "info")
  public List<Map<String, Object>> info() {
    return studentService.info();
  }
}
