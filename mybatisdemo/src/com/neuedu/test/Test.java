package com.neuedu.test;

import com.neuedu.entity.Course;
import com.neuedu.mapper.CourseMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.util.List;

public class Test {
    //创建sqlSession的工厂，一定告诉他配置文件在哪，一个项目中有一个就可以
    public static void main(String[] args) {
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(
                Test.class.getClassLoader().getResourceAsStream("MyBatis.xml"));
        //通过工厂生产sqlSession，一切操作数据库都依赖这个session，你可以把这个session理解成jdbc中的Connection
        SqlSession session = factory.openSession();
        //利用sqlSession生成接口的实现类对象
        CourseMapper courseMapper = session.getMapper(CourseMapper.class);
//        List<Course> courseList = courseMapper.listCourse("大学英语");
//        System.out.println(courseList);


//        for (Course course : courseMapper.listCourse()) {
//            System.out.println(course);
//        }

//        System.out.println(courseMapper.saveCourse());

//        System.out.println(courseMapper.deleteCourse());
//        session.commit();
//        System.out.println(courseMapper.updateCourse());


        Course course = new Course();
        course.setCno("c011");
        course.setCanme("大学数学");
        course.setCredit(1);
        course.setSemester(1);
        System.out.println(courseMapper.saveCourse(course));






















//        List<Course> courseList = session.selectList("com.neuedu.mapper.CourseMapper.listCourse");
//        for (Course course : courseList) {
//            System.out.println(course);
//        }

//        int row = session.insert("com.neuedu.mapper.CourseMapper.saveCourse");
//        session.commit();
//        System.out.println(row);

//        int row = session.delete("com.neuedu.mapper.CourseMapper.deleteCourse");
//        session.commit();
//        System.out.println(row);

//        int row = session.update("com.neuedu.mapper.CourseMapper.updateCourse");
//        session.commit();
//        System.out.println(row);
    }
}
