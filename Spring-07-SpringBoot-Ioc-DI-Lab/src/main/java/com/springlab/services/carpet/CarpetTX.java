package com.springlab.services.carpet;

import com.springlab.enums.City;
import com.springlab.interfaces.carrpetPrices.Carpet;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Component
public class CarpetTX implements Carpet {

    private static final Map<City, BigDecimal> sqPriceCity=new HashMap<>();
    //this static block will run only first time and run time and only one time
    static{
        sqPriceCity.put(City.AUSTIN, new BigDecimal("1.32"));
        sqPriceCity.put(City.DALLAS, new BigDecimal("2.92"));
        sqPriceCity.put(City.SANANTONIO, new BigDecimal("2.65"));

    }
    @Override
    public BigDecimal getSqFtPrice(City city) {
        BigDecimal defaultValue=BigDecimal.ZERO;
        //converting map to set
        Optional<Map.Entry<City, BigDecimal>> collect=sqPriceCity.entrySet().stream().filter(x -> x.getKey()==city).findFirst();

        return collect.isPresent()?collect.get().getValue():defaultValue;
    }


}
