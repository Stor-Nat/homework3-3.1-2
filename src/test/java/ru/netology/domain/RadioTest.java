package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void radioStationNext1() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMaxRadioStation());

        radio.setMaxRadioStation(11);
        assertEquals(0, radio.getMaxRadioStation());
    }

    @Test
    public void radioStationNext2() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMaxRadioStation());

        radio.setMaxRadioStation(9);
        assertEquals(0, radio.getMaxRadioStation());

    }

    @Test
    public void radioStationNext3() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMaxRadioStation());

        radio.setMaxRadioStation(5);
        assertEquals(6, radio.getMaxRadioStation());
    }


    @Test
    public void radioStationPrev1(){
        Radio radio = new Radio();
        assertEquals(0, radio.getMinRadioStation());

        radio.setMinRadioStation(11);
        assertEquals(0, radio.getMinRadioStation());
    }

    @Test
    public void radioStationPrev2(){
        Radio radio = new Radio();
        assertEquals(0, radio.getMinRadioStation());

        radio.setMinRadioStation(5);
        assertEquals(4, radio.getMinRadioStation());
    }

    @Test
    public void radioStationPrev3(){
        Radio radio = new Radio();
        assertEquals(0, radio.getMinRadioStation());

        radio.setMinRadioStation(0);
        assertEquals(9, radio.getMinRadioStation());
    }


    @Test
    public void soundPlus1 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getMaxSound());

        radio.setMaxSound(10);
        assertEquals(10, radio.getMaxSound());
    }

    @Test
    public void soundPlus2 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getMaxSound());

        radio.setMaxSound(0);
        assertEquals(1, radio.getMaxSound());
    }

    @Test
    public void soundPlus3 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getMaxSound());

        radio.setMaxSound(5);
        assertEquals(6, radio.getMaxSound());
    }


}