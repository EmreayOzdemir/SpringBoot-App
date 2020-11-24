package mainPackage.services;

import mainPackage.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours selenium: 30");
    }
}
