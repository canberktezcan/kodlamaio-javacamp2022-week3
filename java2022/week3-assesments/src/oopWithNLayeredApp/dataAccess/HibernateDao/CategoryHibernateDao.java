package oopWithNLayeredApp.dataAccess.HibernateDao;



import oopWithNLayeredApp.dataAccess.CategoryDao;
import oopWithNLayeredApp.entities.Category;

public class CategoryHibernateDao implements CategoryDao{

	@Override
	public void add(Category category) {
		
		System.out.println("Category added by Hibernate");
	}

	
}
