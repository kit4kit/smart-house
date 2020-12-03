package ru.netology;

public class Radio {
    private int currentRadio;
    private int maxRadio;
    private int minRadio;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

    public Radio() {
    }

    public Radio(int maxRadio, int minRadio) {
        this.maxRadio = maxRadio;
        this.minRadio = minRadio;
    }


    public int getCurrentRadio() {
        return currentRadio;
    }

    public void setCurrentRadio(int currentRadio) {
        this.currentRadio = currentRadio;
    }

    public int getMaxRadio() {
        return maxRadio;
    }

    public void setMaxRadio(int maxRadio) {
        this.maxRadio = maxRadio;
    }

    public int getMinRadio() {
        return minRadio;
    }

    public void setMinRadio(int minRadio) {
        this.minRadio = minRadio;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
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
