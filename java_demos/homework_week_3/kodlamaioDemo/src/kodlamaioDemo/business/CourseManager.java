package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.CourseList;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CourseDao;
import kodlamaioDemo.entities.Course;

public class CourseManager {

    private CourseDao courseDao;
    private List<Logger> loggers;

    public CourseManager(CourseDao courseDao, List<Logger> loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course) throws Exception {

        if (course.getPrice() < 0) {
            throw new Exception("Bir kursun fiyatı 0' dan küçük olamaz.");
        }

        for (Course item : CourseList.courses) {
            if (item.getName().equals(course.getName())) {
                throw new Exception("Bu isimde zaten kurs mevcut.");
            }
        }

        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log("Kurs eklendi : " + course.getName());
        }
    }

    public void update(Course course) {
        courseDao.update(course);
    }

    public void delete(Course course) {
        courseDao.delete(course);
    }

    public List<Course> getAll() {
        return courseDao.getAll();
    }

    public Course getById(int id) {
        return courseDao.getById(id);
    }

}
