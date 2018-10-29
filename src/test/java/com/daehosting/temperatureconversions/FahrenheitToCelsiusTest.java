package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class FahrenheitToCelsiusTest {
    @Test
    void getNFahrenheit() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.fahrenheitToCelsius(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(-17.77777775), result);

    }

}