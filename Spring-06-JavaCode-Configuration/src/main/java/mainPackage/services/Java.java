package mainPackage.services;



import mainPackage.interfaces.Course;
import mainPackage.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;

public class Java implements Course {
    private ExtraSession extraSession;
    @Value("JD1")
    private String batch;
    @Value("${instructor}")
    private String instructor;
    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "Java{" +

                ", batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    public Java(ExtraSession extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("weekly teaching hours java: 26");
    }
}
