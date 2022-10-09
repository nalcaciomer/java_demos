package kodlamaioDemo.dataAccess;

import java.util.List;

import kodlamaioDemo.entities.Category;

public interface CategoryDao {
    void add(Category category);

    void update(Category category);

    void delete(Category category);

    List<Category> getAll();

    Category getById(int id);
}
