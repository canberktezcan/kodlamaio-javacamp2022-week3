package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.InstructorDao;
import oopWithNLayeredApp.entities.Instructor;


public class InstructorManager {

	private InstructorDao instructorDao;
	List<Logger> loggers;

	public InstructorManager(InstructorDao instructorDao,List<Logger> loggers) {
		this.instructorDao = instructorDao;
		this.loggers = loggers;
	}
	
	public void add(Instructor instructor) {
		
		instructorDao.add(instructor);
		
		for (Logger logger : loggers) {
			logger.log(instructor.getName());
		}
	}
	
}
