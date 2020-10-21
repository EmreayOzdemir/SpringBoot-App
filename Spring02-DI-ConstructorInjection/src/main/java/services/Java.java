package services;

import interfaces.Course;
import interfaces.ExtraSessions;

public class Java implements Course {
    //whenever a class has need to another class then we need constructor injections
    ExtraSessions extraSessions;//here extrasession is an interface so the other classes are getting this interfce

    OficceHours officeHours;

//    public Java(OficceHours officeHours) {
//        this.officeHours = officeHours;
//    }


    public Java(ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20 + extraSessions.getHours()));
    }

}
