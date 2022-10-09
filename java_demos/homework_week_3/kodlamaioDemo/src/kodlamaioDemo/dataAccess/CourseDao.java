package kodlamaioDemo.dataAccess;

import java.util.List;

import kodlamaioDemo.entities.Course;

public interface CourseDao {
    void add(Course course);

    void update(Course course);

    void delete(Course course);

    List<Course> getAll();

    Course getById(int id);
}
