package services;

import interfaces.Mentor;

public class PartTimeMentor implements Mentor {
    @Override
    public void createAccount(){
        System.out.println("Part time mentor is created ");
    }

}
