package ru.netology;

public class Radio {
    private int currentRadio;
    private int maxRadio;
    private int minRadio;
    private int currentVolume;
    private int maxVolume;
    private int minVolume;

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
    public void nextCurrentRadio(int currentRadio){
        if (currentRadio == 9){
            this.currentRadio = 0;
            return;
        }
        this.currentRadio = currentRadio + 1;
    }
    public void prevCurrentRadio(int currentRadio){
        if(currentRadio == 0){
            this.currentRadio = 9;
            return;
        }
        this.currentRadio = currentRadio - 1;
    }
    public void increaseCurrentVolume(int currentVolume){
        if(currentVolume == 10){
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume + 1;
    }
    public  void decreaseCurrentVolume(int currentVolume){
        if(currentVolume == 0){
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

}