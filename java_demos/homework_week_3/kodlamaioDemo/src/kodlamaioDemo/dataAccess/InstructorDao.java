package kodlamaioDemo.dataAccess;

import java.util.List;

import kodlamaioDemo.entities.Instructor;

public interface InstructorDao {
    void add(Instructor instructor);

    void update(Instructor instructor);

    void delete(Instructor instructor);

    List<Instructor> getAll();

    Instructor getById(int id);
}
