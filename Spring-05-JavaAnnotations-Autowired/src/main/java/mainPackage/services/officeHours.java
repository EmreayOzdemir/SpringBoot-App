package mainPackage.services;


import mainPackage.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class officeHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 4;
    }
}
