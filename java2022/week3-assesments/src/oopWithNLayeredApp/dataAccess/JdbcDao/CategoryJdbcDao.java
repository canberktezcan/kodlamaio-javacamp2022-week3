package oopWithNLayeredApp.dataAccess.JdbcDao;



import oopWithNLayeredApp.dataAccess.CategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryJdbcDao implements CategoryDao{

	@Override
	public void add(Category category) {
		System.out.println("Category added by Jdbc");
		
	}

}
