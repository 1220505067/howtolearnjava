package database;

import entities.Category;
import entities.Course;
import entities.Instructor;

public class Jdbc implements CategoryDao, CourseDao,InstructorDao{

    @Override
    public void add(Category category) {
        System.out.println("JDBC eklendi.");
    }

    @Override
    public void add(Course course) {
        System.out.println("JDBC eklendi.");

    }

    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC eklendi.");

    }
}
