package com.springlab.calculator;

import com.springlab.enums.City;
import com.springlab.interfaces.carrpetPrices.Carpet;
import com.springlab.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class Calculator {
    @Qualifier("carpetVA")
    @Autowired
    private Carpet carpet;

    @Qualifier("kitchen")
    @Autowired
    private Floor floor;

    public String getTotalCarpetCost(City city) throws Exception{
        BigDecimal cost=carpet.getSqFtPrice(city).multiply(floor.getArea());
        if(cost.compareTo(BigDecimal.ZERO)==0){
            throw new Exception("this city does not exist");
        }
        return "Total cost for carpet: "+ (carpet.getSqFtPrice(city).multiply(floor.getArea()));
    }
}
