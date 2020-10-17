import interfaces.Mentor;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.FullTimeMentor;

public class CybertekApp {
    public static void main(String[] args) {
        //here created a container where I save all my beans, what ever beans I defined inside my config file.
        BeanFactory container=new ClassPathXmlApplicationContext("config.xml");
       // Mentor mentor=new FullTimeMentor(); usually we do it like that but spring is doing better
        //so follow the next!
        Mentor mentor= (Mentor) container.getBean("fullTimeMentor");
        mentor.createAccount();
        Mentor mentor2= (Mentor) container.getBean("partTimeMentor");
        mentor2.createAccount();
        //the second way to create a container
        ApplicationContext container2=new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor3= (Mentor) container2.getBean("fullTimeMentor");
        mentor.createAccount();
        Mentor mentor4= (Mentor) container2.getBean("partTimeMentor");
        mentor2.createAccount();
        //another way to create and return the mentor object
        //Mentor mentor=container.getBean("fullTimeMentor", Mentor.class);

    }
}
