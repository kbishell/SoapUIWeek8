package com.daehosting.temperatureconversions;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class WindChillInCelsiusTest {
    @Test
    void getNWindSpeed() {
        TemperatureConversionsSoapType service = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal result = service.windChillInCelsius(BigDecimal.valueOf(0), BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(1.41), result);

    }

}