package mainPackage.services;

import mainPackage.interfaces.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Java implements Course {
    @Autowired//this one is filed constructor injection
    private officeHours officeHours;
    //inside the class autowired used for the constructor
//    @Autowired
//    public Java(mainPackage.mainPackage.services.officeHours officeHours) {
//        this.officeHours = officeHours;
//    }
//    //this is the second way to write the constructor annotations
//    //setter injections
//    @Autowired
//    public void setOfficeHours(mainPackage.mainPackage.services.officeHours officeHours) {
//        this.officeHours = officeHours;
//    }

//    public mainPackage.mainPackage.services.officeHours getOfficeHours() {
//        return officeHours;
//    }

    public void getTeachingHours() {
        System.out.println("Weekly teaching hours java: "+(30 + officeHours.getHours()));
    }
}
