package mainPackage.services;


import lombok.Data;
import mainPackage.interfaces.Course;
import mainPackage.interfaces.ExtraSession;

@Data
public class Java implements Course {
    private ExtraSession extraSessions;
//
//    public Java(ExtraSession extraSessions) {
//        this.extraSessions = extraSessions;
//    }
    //private OfficeHours officeHours;
/*
    public OfficeHours getOfficeHours() {
        return officeHours;
    }
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }
 */

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }
}
