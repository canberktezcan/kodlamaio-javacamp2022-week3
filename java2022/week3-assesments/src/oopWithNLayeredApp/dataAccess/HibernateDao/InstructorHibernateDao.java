package oopWithNLayeredApp.dataAccess.HibernateDao;

import oopWithNLayeredApp.dataAccess.InstructorDao;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorHibernateDao implements InstructorDao{

	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added by Hibernate");
		
	}

}
