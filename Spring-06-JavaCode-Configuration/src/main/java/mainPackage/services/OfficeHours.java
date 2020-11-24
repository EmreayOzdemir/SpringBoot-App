package mainPackage.services;


import mainPackage.interfaces.ExtraSession;

public class OfficeHours implements ExtraSession {

    @Override
    public int getHours() {
        return 6;
    }
}
