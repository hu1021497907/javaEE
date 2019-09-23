package com.neuedu.dao;

import com.neuedu.demo1.Course;

import java.util.List;

public interface CourseDAO {
    /**
     * 根据Course表主键来删除一条数据
     * @return
     */
    int deleteCourseByCno(String cno);

    /**
     * 增
     * @param course
     * @return
     */
    int insertCourseByCno(Course course);

    /**
     * 修改
     * @param course
     * @return
     */
    int updateCourseByCno (Course course);

    /**
     * 查找
     * @return
     */
    List<Course> listCourse();



}
