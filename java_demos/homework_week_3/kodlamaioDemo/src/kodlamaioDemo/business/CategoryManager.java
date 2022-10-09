package kodlamaioDemo.business;

import java.util.List;

import kodlamaioDemo.CategoryList;
import kodlamaioDemo.core.logging.Logger;
import kodlamaioDemo.dataAccess.CategoryDao;
import kodlamaioDemo.entities.Category;

public class CategoryManager {

    private CategoryDao categoryDao;
    private List<Logger> loggers;

    public CategoryManager(CategoryDao categoryDao, List<Logger> loggers) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
    }

    public void add(Category category) throws Exception {
        for (Category item : CategoryList.categories) {
            if (item.getName().equals(category.getName())) {
                throw new Exception("Bu kategori ismi zaten mevcut.");
            }
        }

        categoryDao.add(category);

        for (Logger logger : loggers) {
            logger.log("Kategori eklendi : " + category.getName());
        }
    }

    public void update(Category category) {
        categoryDao.update(category);
    }

    public void delete(Category category) {
        categoryDao.delete(category);
    }

    public List<Category> getAll() {
        return categoryDao.getAll();
    }

    public Category getById(int id) {
        return categoryDao.getById(id);
    }

}
