package kodlamaioDemo.dataAccess.hibernate;

import java.util.List;

import kodlamaioDemo.dataAccess.InstructorDao;
import kodlamaioDemo.entities.Instructor;

public class HibernateInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen eklendi.");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen güncellendi.");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Hibernate ile eğitmen silindi.");
    }

    @Override
    public List<Instructor> getAll() {
        System.out.println("Hibernate ile eğitmenler listelendi.");
        return null;
    }

    @Override
    public Instructor getById(int id) {
        System.out.println("Hibernate ile eğitmen listelendi");
        return null;
    }
}
