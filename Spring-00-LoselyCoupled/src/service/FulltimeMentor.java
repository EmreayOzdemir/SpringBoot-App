package service;

import implementation.Mentor;

public class FulltimeMentor implements Mentor {
    @Override
    public void createAccount(){
        System.out.println("Full time mentor account is created..");
    }

}
