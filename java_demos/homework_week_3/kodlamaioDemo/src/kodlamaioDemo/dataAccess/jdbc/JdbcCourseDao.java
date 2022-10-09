package kodlamaioDemo.dataAccess.jdbc;

import java.util.List;

import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class JdbcCourseDao implements CourseDao {

    @Override
    public void add(Course course) {
        System.out.println("Jdbc ile kurs eklendi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Jdbc ile kurs güncellendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Jdbc ile kurs silindi.");
    }

    @Override
    public List<Course> getAll() {
        System.out.println("Jdbc ile kurslar listelendi.");
        return null;
    }

    @Override
    public Course getById(int id) {
        System.out.println("Jdbc ile kurs listelendi.");
        return null;
    }

}
