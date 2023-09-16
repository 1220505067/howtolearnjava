import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.logging.DataBaseLogger;
import core.logging.FileLogger;
import core.logging.ILogger;
import core.logging.MailLogger;
import database.HibernateDao;
import database.Jdbc;
import entities.Category;
import entities.Course;
import entities.Instructor;


public class Main {
    public static void main(String[] args) throws Exception {
        ILogger[] loggers = {new FileLogger(),new DataBaseLogger(), new MailLogger()};
        System.out.println("************************");

        Course course1 = new Course("Java",1);
        Course course2 = new Course("Python",5000);
        Course[] courses = {course1};

        CourseManager courseManager = new CourseManager(new HibernateDao(),loggers);
        courseManager.add(course1);

        System.out.println("************************");

        Instructor instructor1 = new Instructor("Cem ", "Yılmaz");
        Instructor instructor2 = new Instructor("Cem Vural ", "Yılmaz");
        InstructorManager instructorManager = new InstructorManager(new Jdbc(),loggers);
        instructorManager.add(instructor1);


        System.out.println("************************");

        Category category1 = new Category("Programlama");
        Category category2 = new Category("Algoritma");


        Category[] categories = { category2 };


        CategoryManager categoryManager = new CategoryManager(new Jdbc(),loggers,categories);
        categoryManager.add(category1);


    }
}