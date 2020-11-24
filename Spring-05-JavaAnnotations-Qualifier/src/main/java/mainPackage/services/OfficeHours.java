package mainPackage.services;



import mainPackage.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class OfficeHours implements ExtraSession {

    @Override
    public int getHours() {
        return 6;
    }
}
