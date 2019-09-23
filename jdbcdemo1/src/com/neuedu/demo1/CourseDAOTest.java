package com.neuedu.demo1;

import com.neuedu.dao.CourseDAO;
import com.neuedu.dao.impl.CourseDAOImpl;

import java.util.List;

public class CourseDAOTest {

    public static void main(String[] args) {
        CourseDAO courseDAO = new CourseDAOImpl();

//        int row = courseDAO.deleteCourseByCno("c008");
//        System.out.println(row);

//        Course course = new Course();
//        course.setCno("c008");
//        course.setCanme("数学课");
//        course.setCredit(4);
//        course.setSemester(4);
//        courseDAO.insertCourseByCno(course);

//        Course course = new Course();
//        course.setCno("c008");
//        course.setCanme("语文课");
//        course.setCredit(4);
//        course.setSemester(4);
//        courseDAO.updateCourseByCno(course);

        List<Course> courseList = courseDAO.listCourse();
        for (Course course : courseList) {
            System.out.println(course);
        }

    }
}
