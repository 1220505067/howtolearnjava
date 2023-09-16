package database;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class HibernateDao implements CategoryDao, CourseDao,InstructorDao{

    @Override
    public void add(Category category) {
        System.out.println("Hibernate eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate eklendi.");
    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate eklendi.");
    }
}
