package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldSetMaxRadio(){
        Radio radio = new Radio(10, 0);
        assertEquals(10, radio.getMaxRadio());
    }


    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentRadio', 7, 8",
                    "'expected, currentRadio', 10, 0"
            }
    )
    void nextCurrentRadio(String test, int currentRadio, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadio(currentRadio);
        radio.nextCurrentRadio();
        assertEquals(expected, radio.getCurrentRadio());
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentRadio', 7, 6",
                    "'expected, currentRadio', 0, 10"
            }
    )
    void shouldPrevCurrentRadio(String test, int currentRadio, int expected) {
        Radio radio = new Radio();
        radio.setCurrentRadio(currentRadio);
        radio.prevCurrentRadio();
        assertEquals(expected, radio.getCurrentRadio());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentVolume', 100, 100",
                    "'expected, currentRadio', 8, 9"
            }
    )

    void increaseCurrentVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.increaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentVolume', 0, 0",
                    "'expected, currentRadio', 8, 7"
            }
    )
    void decreaseCurrentVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);
        radio.decreaseCurrentVolume();
        assertEquals(expected, radio.getCurrentVolume());
    }
}