package com.springlab.interfaces.carrpetPrices;

import com.springlab.enums.City;

import java.math.BigDecimal;

public interface Carpet {

    BigDecimal getSqFtPrice(City city);
    //double getSqFtPrice(City city); u can use this one but use also bigdecimal
}
