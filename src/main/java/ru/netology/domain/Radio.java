package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation;
    private int currentSound;
    private int minSound;
    private int maxSound;


    public int getPrevRadioStation() {
        return currentRadioStation;
    }

    public void setPrevRadioStation(int currentRadioStation,int maxRadioStation, int minRadioStation) {
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

    public int getNextRadioStation() {
        return currentRadioStation;
    }

    public void setNextRadioStation(int currentRadioStation,int maxRadioStation, int minRadioStation) {
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

    public int getMinusSound() {
        return currentSound;
    }

    public void setMinusSound(int currentSound, int minSound, int maxSound) {
        if (currentSound == minSound) {
            this.currentSound = minSound;
            return;
        }
        if (currentSound < maxSound) {
            currentSound = currentSound - 1;
        }
        if (currentSound == maxSound) {
            currentSound = currentSound - 1;
        }
        this.currentSound = currentSound;
    }

    public int getPlusSound() {
        return currentSound;
    }

    public void setPlusSound(int currentSound, int minSound, int maxSound) {
        if (currentSound == maxSound) {
            this.currentSound = maxSound;
            return;
        }
        if (currentSound > minSound) {
            currentSound = currentSound + 1;
        }
        if (currentSound == minSound) {
            currentSound = currentSound + 1;
        }
        this.currentSound = currentSound;
    }

}