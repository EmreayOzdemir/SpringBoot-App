package mainPackage.services;


import mainPackage.interfaces.ExtraSession;
import org.springframework.stereotype.Component;

@Component
public class MockInterviewHours implements ExtraSession {

    @Override
    public int getHours() {
        return 6;
    }
}
