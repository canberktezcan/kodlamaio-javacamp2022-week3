package oopWithNLayeredApp.business;

import java.util.Iterator;
import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryManager {
	private CategoryDao categoryDao;
	List<Category> categories;
	List<Logger> loggers;
	
	public CategoryManager(CategoryDao categoryDao, List<Category> categories,List<Logger> loggers ) {
		super();
		this.categoryDao = categoryDao;
		this.categories = categories;
		this.loggers = loggers;
	}

	public void add(Category category) throws Exception {
		
		 
			if(categories.isEmpty()) {
				categories.add(category);
				categoryDao.add(category);
			}else {
				for (Category existingcategory : categories) {
					if(existingcategory.getName().equals(category.getName()) ) {
						throw new Exception("Bu kategori zaten mevcut lütfen yeni bir kategori ekleyin !");
					}
				}
				
				categories.add(category);
				categoryDao.add(category);
			}
			
			for (Logger logger : loggers) {
				logger.log(category.getName());
			}
			
			
		
		
	}
	
}
