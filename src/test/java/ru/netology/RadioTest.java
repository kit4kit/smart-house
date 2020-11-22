package ru.netology;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentRadio', 7, 8",
                    "'expected, currentRadio', 9, 0"
            }
    )
    void nextCurrentRadio(String test, int currentRadio, int expected) {
        Radio radio = new Radio();
        radio.nextCurrentRadio(currentRadio);
        assertEquals(expected, radio.getCurrentRadio());
    }
    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentRadio', 7, 6",
                    "'expected, currentRadio', 0, 9"
            }
    )
    void shouldPrevCurrentRadio(String test, int currentRadio, int expected) {
        Radio radio = new Radio();
        radio.prevCurrentRadio(currentRadio);
        assertEquals(expected, radio.getCurrentRadio());
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "'expected, currentVolume', 10, 10",
                    "'expected, currentRadio', 8, 9"
            }
    )
    void increaseCurrentVolume(String test, int currentVolume, int expected) {
        Radio radio = new Radio();
        radio.increaseCurrentVolume(currentVolume);
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
        radio.decreaseCurrentVolume(currentVolume);
        assertEquals(expected, radio.getCurrentVolume());
    }
}