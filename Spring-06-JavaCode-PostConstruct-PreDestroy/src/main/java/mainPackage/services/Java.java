package mainPackage.services;

import mainPackage.interfaces.Course;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
@Component
public class Java implements Course {

    public void getTeachingHours() {
        System.out.println("teaching hourse are: 20");
    }
    @PostConstruct
    public void postConstruct(){
        System.out.println("executing postconstrct");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("executing pre destroy");
    }


}
