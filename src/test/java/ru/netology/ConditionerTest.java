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
            value = {"'maxTemperature, currentTemperature, expected', 10, 9, 10, 0",
                     "'maxTemperature, currentTemperature, expected', 10, 10, 10, 0",
            }
    )
    public void shouldIncreaseCurrentTemperature(String test, int maxTemperature, int currentTemperature, int expected, int minTemperature){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.increaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }

    @ParameterizedTest
    @CsvSource(
            value = {"'minTemperature, currentTemperature, expected', 0, 9, 8, 10",
                     "'minTemperature, currentTemperature, expected', 0, 0, 0, 10",
            }
    )
    public void shouldDecreaseCurrentTemperature(String test, int minTemperature, int currentTemperature, int expected, int maxTemperature){
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(maxTemperature);
        conditioner.setMinTemperature(minTemperature);
        conditioner.setCurrentTemperature(currentTemperature);
        conditioner.decreaseCurrentTemperature();
        assertEquals(expected, conditioner.getCurrentTemperature());
    }
}