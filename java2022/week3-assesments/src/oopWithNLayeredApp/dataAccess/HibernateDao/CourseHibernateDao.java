package oopWithNLayeredApp.dataAccess.HibernateDao;

import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseHibernateDao implements CourseDao{



	@Override
	public void add(Course course) {
		System.out.println("Course added by Hibernate");
		
	}

}
