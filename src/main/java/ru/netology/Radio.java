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

    public void nextCurrentRadio(){
        if (currentRadio == 10){
            this.currentRadio = 0;
            return;
        }
        this.currentRadio = currentRadio + 1;
    }

    public void prevCurrentRadio(){
        if(currentRadio == 0){
            this.currentRadio = 10;
            return;
        }
        this.currentRadio = currentRadio - 1;
    }
    public void increaseCurrentVolume(){
        if(currentVolume == 100){
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume + 1;
    }
    public  void decreaseCurrentVolume(){
        if(currentVolume == 0){
            this.currentVolume = currentVolume;
            return;
        }
        this.currentVolume = currentVolume - 1;
    }

}
