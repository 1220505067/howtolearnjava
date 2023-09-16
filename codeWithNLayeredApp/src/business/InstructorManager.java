package business;

import core.logging.ILogger;
import database.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private ILogger[] loggers;

    public InstructorManager(InstructorDao instructorDao, ILogger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }
    public void add(Instructor instructor){


        instructorDao.add(instructor);

        for(ILogger logger:loggers){
            logger.log(instructor.getFirstName()+" "+instructor.getLastName());
        }
    }
}