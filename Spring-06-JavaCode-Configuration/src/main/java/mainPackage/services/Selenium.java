package mainPackage.services;


import mainPackage.interfaces.Course;

public class Selenium implements Course {

    @Override
    public void getTeachingHours() {
        System.out.println("weekly teaching hours: 26");
    }
}
