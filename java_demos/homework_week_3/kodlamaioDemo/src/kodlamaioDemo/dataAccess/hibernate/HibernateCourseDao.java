package kodlamaioDemo.dataAccess.hibernate;

import java.util.List;

import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile kurs eklendi.");
    }

    @Override
    public void update(Course course) {
        System.out.println("Hibernate ile kurs güncellendi.");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Hibernate ile kurs silindi.");
    }

    @Override
    public List<Course> getAll() {
        System.out.println("Hibernate ile kurslar listelendi.");
        return null;
    }

    @Override
    public Course getById(int id) {
        System.out.println("Hibernate ile kurs listelendi.");
        return null;
    }
}
