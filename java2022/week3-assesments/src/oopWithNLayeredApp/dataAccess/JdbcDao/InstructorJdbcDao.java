package oopWithNLayeredApp.dataAccess.JdbcDao;

import oopWithNLayeredApp.dataAccess.InstructorDao;
import oopWithNLayeredApp.entities.Instructor;

public class InstructorJdbcDao implements InstructorDao {


	@Override
	public void add(Instructor instructor) {
		System.out.println("Instructor added by Jdbc");
		
	}
}
