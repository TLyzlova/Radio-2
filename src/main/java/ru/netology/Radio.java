package ru.netology;

public class Radio {

    private int minStation = 0;
    private int maxStation = 9;
    private int currentStation;

    private int minVolume = 0;
    private int maxVolume = 10;
    private  int currentVolume;



    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }


    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation (){
        if (currentStation >=  maxStation) {
            currentStation = minStation;
        } else {
            currentStation = currentStation + 1;
        }
    }
    public void prevStation (){
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else currentStation = currentStation -1;

    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > maxVolume) {
            return;
        }
        if (currentVolume < minVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }

    public void decreaseVolume() {
        if (currentVolume >= minVolume){
            currentVolume = currentVolume + 1;
        } else {
            return;
        }
    }
}


