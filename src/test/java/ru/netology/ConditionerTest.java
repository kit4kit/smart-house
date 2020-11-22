package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {

    @Test
    public void shouldGetAndSet() {
        Conditioner conditioner = new Conditioner();
        String expected = "Кондишн";

        assertNull(conditioner.getName());
        conditioner.setName(expected);
        assertEquals(expected, conditioner.getName());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'maxTemperature, currentTemperature, expected', 10, 9, 10",
                     "'maxTemperature, currentTemperature, expected', 10, 10, 10",
            }
    )
    public void shouldIncreaseCurrentTemperature(String test, int maxTemperature, int currentTemperature, int expected){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.increaseCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'maxTemperature, currentTemperature, expected', 0, 9, 8",
                    "'maxTemperature, currentTemperature, expected', 0, 0, 0",
            }
    )
    public void shouldDecreaseCurrentTemperature(String test, int minTemperature, int currentTemperature, int expected){
        Conditioner conditioner = new Conditioner();
        conditioner.setMinTemperature(minTemperature);
        conditioner.decreaseCurrentTemperature(currentTemperature);
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}