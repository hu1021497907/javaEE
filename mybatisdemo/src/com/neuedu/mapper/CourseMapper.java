package com.neuedu.mapper;

import com.neuedu.entity.Course;

import java.util.List;

public interface CourseMapper {

    List<Course> listCourse(String cname);
    int saveCourse(Course course);
//    int deleteCourse();
//    int updateCourse();
}
