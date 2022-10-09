package kodlamaioDemo.dataAccess.jdbc;

import java.util.List;

import kodlamaioDemo.dataAccess.InstructorDao;
import kodlamaioDemo.entities.Instructor;

public class JdbcInstructorDao implements InstructorDao {

    @Override
    public void add(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen eklendi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen güncellendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Jdbc ile eğitmen silindi.");
    }

    @Override
    public List<Instructor> getAll() {
        System.out.println("Jdbc ile eğitmenler listelendi.");
        return null;
    }

    @Override
    public Instructor getById(int id) {
        System.out.println("Jdbc ile eğitmen listelendi");
        return null;
    }

}
