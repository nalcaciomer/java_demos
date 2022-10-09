package kodlamaioDemo;

import java.util.Arrays;
import java.util.List;

import kodlamaioDemo.business.CategoryManager;
import kodlamaioDemo.business.CourseManager;
import kodlamaioDemo.business.InstructorManager;
import kodlamaioDemo.core.logging.DatabaseLogger;
import kodlamaioDemo.core.logging.FileLogger;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.core.logging.MailLogger;
import kodlamaioDemo.dataAccess.hibernate.HibernateCourseDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcCategoryDao;
import kodlamaioDemo.dataAccess.jdbc.JdbcInstructorDao;
import kodlamaioDemo.entities.Category;
import kodlamaioDemo.entities.Course;
import kodlamaioDemo.entities.Instructor;

public class Main {
    public static void main(String[] args) throws Exception {
        Instructor instructor = new Instructor(1, "Engin", "Demiroğ");
        Course course = new Course(3, 1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA + REACT)", "", 0, "");
        Category category = new Category(2, "Backend Development");

        List<Logger> loggers = Arrays.asList(new FileLogger(), new DatabaseLogger(), new MailLogger());

        // *** Validation Kuralları Denemeleri ***
        // Course course = new Course(3, 1, "(2022) Yazılım Geliştirici Yetiştirme Kampı
        // - JAVA", "", 0, "");
        // Course course = new Course(3, 1, "Yazılım Geliştirici Yetiştirme Kampı (JAVA
        // + REACT)", "", -100, "");
        // Category category = new Category(2, "Programlama");

        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);

        instructorManager.add(instructor);
        courseManager.add(course);
        categoryManager.add(category);
    }
}
