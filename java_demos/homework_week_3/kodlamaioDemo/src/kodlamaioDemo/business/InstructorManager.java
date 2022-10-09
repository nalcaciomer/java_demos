package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.InstructorDao;
import kodlamaioDemo.entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private List<Logger> loggers;

    public InstructorManager(InstructorDao instructorDao, List<Logger> loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log("Eğitmen eklendi : " + instructor.getFirstName() + " " + instructor.getLastName());
        }
    }

    public void update(Instructor instructor) {
        instructorDao.update(instructor);
    }

    public void delete(Instructor instructor) {
        instructorDao.delete(instructor);
    }

    public List<Instructor> getAll() {
        return instructorDao.getAll();
    }

    public Instructor getById(int id) {
        return instructorDao.getById(id);
    }
}
