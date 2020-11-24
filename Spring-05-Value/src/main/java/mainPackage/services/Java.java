package mainPackage.services;


import mainPackage.interfaces.Course;
import mainPackage.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
//@AllArgsConstructor
public class Java implements Course {
    @Value("JD1")//this one is hard coded
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")//it will pull from application.properties
    private String[] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +

                '}';
    }

    //field injection
   // @Autowired
   // @Qualifier("officeHours")
   private ExtraSession extraSession;
//    @Autowired
//    public Java(ExtraSession extraSession) {
//        this.extraSession = extraSession;
//    }

    public Java(@Qualifier("officeHours") ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours java: "+(20+extraSession.getHours()));
    }




}
