package business;

import core.logging.ILogger;
import database.CategoryDao;
import entities.Category;

public class CategoryManager {
    private CategoryDao categoryDao;
    private ILogger[] loggers;
    private Category[] category;

    public CategoryManager(CategoryDao categoryDao, ILogger[] loggers,Category[] category) {
        this.categoryDao = categoryDao;
        this.loggers = loggers;
        this.category=category;
    }
    public void add(Category category) throws Exception {
        for (Category category_ : this.category) {
            if (category_.getName().equals(category.getName())) {
                throw new Exception("Kategori mevcut");
            }
        }

        categoryDao.add(category);

        for (ILogger logger : loggers){
            logger.log(category.getName());
        }
    }
}