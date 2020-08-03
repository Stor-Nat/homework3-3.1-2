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

    public int getMinSound() {
        return currentSound;
    }

    public void setMinSound(int currentSound) {
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

    public int getMaxSound() {
        return currentSound;
    }

    public void setMaxSound(int currentSound) {
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