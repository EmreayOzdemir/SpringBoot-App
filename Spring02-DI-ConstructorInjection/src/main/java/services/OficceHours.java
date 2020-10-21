package services;

import interfaces.ExtraSessions;

public class OficceHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 5;
    }
}
