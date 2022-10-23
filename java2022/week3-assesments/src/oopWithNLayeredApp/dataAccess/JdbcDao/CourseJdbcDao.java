package oopWithNLayeredApp.dataAccess.JdbcDao;

import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseJdbcDao implements CourseDao {

	
	@Override
	public void add(Course course) {
		System.out.println("Course added by Jdbc");
		
	}

}
