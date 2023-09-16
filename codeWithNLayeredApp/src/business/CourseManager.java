package business;

import core.logging.ILogger;
import database.CourseDao;
import entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private ILogger[] loggers;

    public CourseManager(CourseDao courseDao, ILogger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }
    public void add(Course course) throws Exception{

        if (course.getPrice()<0){
            throw new Exception("Kurs fiyatı sıfırdan küçük olamaz.");
        }
        courseDao.add(course);
        for(ILogger logger:loggers){
            logger.log(course.getName());
        }


    }
}