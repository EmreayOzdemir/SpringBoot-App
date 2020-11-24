package mainPackage.services;



import mainPackage.interfaces.Course;
import mainPackage.interfaces.ExtraSession;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Java implements Course {
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
