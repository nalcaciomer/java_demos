package kodlamaioDemo.dataAccess.hibernate;

import java.util.List;

import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class HibernateCategoryDao implements CategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile kategori eklendi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Hibernate ile kategori güncellendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Hibernate ile kategori silindi.");
    }

    @Override
    public List<Category> getAll() {
        System.out.println("Hibernate ile kategoriler listelendi.");
        return null;
    }

    @Override
    public Category getById(int id) {
        System.out.println("Hibernate ile kategori listelendi.");
        return null;
    }
}
