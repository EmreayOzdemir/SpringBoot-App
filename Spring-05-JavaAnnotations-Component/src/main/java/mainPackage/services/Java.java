package mainPackage.services;


import mainPackage.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours java: 23");
    }
}
