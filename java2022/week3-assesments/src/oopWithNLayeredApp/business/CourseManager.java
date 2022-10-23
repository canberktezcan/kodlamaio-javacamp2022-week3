package oopWithNLayeredApp.business;

import java.util.List;

import oopWithNLayeredApp.core.logging.Logger;
import oopWithNLayeredApp.dataAccess.CourseDao;
import oopWithNLayeredApp.entities.Course;

public class CourseManager {

	private CourseDao courseDao;
	List<Course> courses;
	List<Logger> loggers;

	public CourseManager(CourseDao courseJdbcDao, List<Course> courses,List<Logger> loggers) {
		this.courseDao = courseJdbcDao;
		this.courses = courses;
		this.loggers = loggers;
	}


	public void add(Course course) throws Exception {

		if (course.getPrice() < 0) {
			throw new Exception("Kurs fiyati 0 tl'den daha kucuk olamaz !");
		} else {
			if(courses.isEmpty()) {
				courses.add(course);
				courseDao.add(course);
			}else {
				for (Course existingcourse : courses) {
					if(existingcourse.getName().equals(course.getName()) ) {
						throw new Exception("Bu kurs zaten mevcut lütfen yeni bir kurs ekleyin !");
					}
				}
				
				courses.add(course);
				courseDao.add(course);
			}
			
			for (Logger logger : loggers) {
				logger.log(course.getName());
			}
			
			
		}

	}
}
