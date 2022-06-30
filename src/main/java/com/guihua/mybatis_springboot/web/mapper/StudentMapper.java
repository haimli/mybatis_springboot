package com.guihua.mybatis_springboot.web.mapper;

import com.guihua.mybatis_springboot.web.entity.Student;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version v1.0
 * @ClassName: StudentMapper.java
 * @description:
 * @author: haiming.li
 * @createDate: 2022-06-29 07:18
 */
@Mapper
public interface StudentMapper {

  List<Student> getStudentInfo();

  @MapKey("id")
  List<Map<String, Object>> info();
}
