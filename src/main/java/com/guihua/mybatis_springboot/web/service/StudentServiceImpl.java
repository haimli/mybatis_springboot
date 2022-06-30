package com.guihua.mybatis_springboot.web.service;

import com.guihua.mybatis_springboot.web.entity.Student;
import com.guihua.mybatis_springboot.web.mapper.StudentMapper;
import java.util.List;
import java.util.Map;
import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @version v1.0
 * @ClassName: StudentServiceImpl.java
 * @description:
 * @author: haiming.li
 * @createDate: 2022-06-29 07:30
 */
@Service
@Slf4j
public class StudentServiceImpl {

  @Resource
  private StudentMapper studentMapper;

  public List<Student> getStudentInfo() {
    return studentMapper.getStudentInfo();
  }

  public List<Map<String, Object>> info() {
    return studentMapper.info();
  }
}
