package ru.netology.service;

public class Radio {
    private int currentStation;
    private int volume;

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
        if (newCurrentStation > 9) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void nextStation() {
        if (currentStation != 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void prevStation() {
        if (currentStation != 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
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

