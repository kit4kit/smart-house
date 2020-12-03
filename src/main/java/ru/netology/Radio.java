package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentRadio;
    private int maxRadio;
    private int minRadio;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public Radio(int maxRadio, int minRadio) {
        this.maxRadio = maxRadio;
        this.minRadio = minRadio;
    }

    public void nextCurrentRadio() {
        if (currentRadio == maxRadio) {
            this.currentRadio = minRadio;
            return;
        }
        this.currentRadio = currentRadio + 1;
    }

    public void prevCurrentRadio() {
        if (currentRadio == minRadio) {
            this.currentRadio = maxRadio;
            return;
        }
        this.currentRadio = currentRadio - 1;
    }

    public void increaseCurrentVolume() {
        if (currentVolume == maxVolume) {
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume + 1;
    }

    public void decreaseCurrentVolume() {
        if (currentVolume == minVolume) {
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

}
