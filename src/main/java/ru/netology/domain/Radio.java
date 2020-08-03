package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation = 0;
    private int maxRadioStation = 9;
    private int currentSound;
    private int minSound = 0;
    private int maxSound = 10;


    public int getMinRadioStation() {
        return currentRadioStation;
    }

    public void setMinRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        }
        if (currentRadioStation == minRadioStation) {
            currentRadioStation = maxRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public int getMaxRadioStation() {
        return currentRadioStation;
    }

    public void setMaxRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        }
        if (currentRadioStation == maxRadioStation) {
            currentRadioStation = minRadioStation;
        }
        this.currentRadioStation = currentRadioStation;
    }


}