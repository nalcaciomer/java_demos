package kodlamaioDemo.dataAccess.jdbc;

import java.util.List;

import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class JdbcCategoryDao implements CategoryDao {

    @Override
    public void add(Category category) {
        System.out.println("Jdbc ile kategori eklendi.");
    }

    @Override
    public void update(Category category) {
        System.out.println("Jdbc ile kategori güncellendi.");
    }

    @Override
    public void delete(Category category) {
        System.out.println("Jdbc ile kategori silindi.");
    }

    @Override
    public List<Category> getAll() {
        System.out.println("Jdbc ile kategoriler listelendi.");
        return null;
    }

    @Override
    public Category getById(int id) {
        System.out.println("Jdbc ile kategori listelendi.");
        return null;
    }

}
