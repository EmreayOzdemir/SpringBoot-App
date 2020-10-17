package service;

public class CybertekApp {
    public static void main(String[] args) {
        FulltimeMentor fullTime=new FulltimeMentor();
        //PartTimeMentor partTime=new PartTimeMentor();
        //MentorAccount mentor=new MentorAccount(partTime);
        MentorAccount mentor=new MentorAccount(fullTime);
        mentor.manageAccount();
    }
}
