import mainPackage.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = container.getBean("java",Course.class);
        Course course2 = container.getBean("selenium",Course.class);
        Course course3= container.getBean("api",Course.class);
        //   Course course3= container.getBean("API",Course.class);
        //bean ID will be all cap if the class name is Cap


        course.getTeachingHours();
        course2.getTeachingHours();
        course3.getTeachingHours();
    }
}
