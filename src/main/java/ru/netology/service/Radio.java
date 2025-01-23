package ru.netology.service;

public class Radio {
    private int currentStation;
    private int volume;
    private int maxStation;

    public Radio() {
        this.maxStation = 9;

    }

    public Radio(int countStation) {
        this.maxStation = countStation - 1;

    }


    public int getCurrentStation(){
        return currentStation;
    }
    public int getVolume(){
        return volume;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maxStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation != maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void increaseVolume() {
        if (volume != 100) {
            volume = volume + 1;
        } else {
            volume = 100;
        }

    }

    public void reduceVolume() {
        if (volume != 0) {
            volume = volume - 1;
        } else {
            volume = 0;
        }
    }

}