package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void radioStationNext1() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNextRadioStation());

        radio.setNextRadioStation(11, 9, 0);
        assertEquals(0, radio.getNextRadioStation());
    }

    @Test
    public void radioStationNext2() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNextRadioStation());

        radio.setNextRadioStation(9, 9, 0);
        assertEquals(0, radio.getNextRadioStation());

    }

    @Test
    public void radioStationNext3() {
        Radio radio = new Radio();
        assertEquals(0, radio.getNextRadioStation());

        radio.setNextRadioStation(5, 9, 0);
        assertEquals(6, radio.getNextRadioStation());
    }


    @Test
    public void radioStationPrev1(){
        Radio radio = new Radio();
        assertEquals(0, radio.getPrevRadioStation());

        radio.setPrevRadioStation(11, 9, 0);
        assertEquals(0, radio.getPrevRadioStation());
    }

    @Test
    public void radioStationPrev2(){
        Radio radio = new Radio();
        assertEquals(0, radio.getPrevRadioStation());

        radio.setPrevRadioStation(5, 9, 0);
        assertEquals(4, radio.getPrevRadioStation());
    }

    @Test
    public void radioStationPrev3(){
        Radio radio = new Radio();
        assertEquals(0, radio.getPrevRadioStation());

        radio.setPrevRadioStation(0, 9, 0);
        assertEquals(9, radio.getPrevRadioStation());
    }


    @Test
    public void soundPlus1 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getPlusSound());

        radio.setPlusSound(10, 0, 10);
        assertEquals(10, radio.getPlusSound());
    }

    @Test
    public void soundPlus2 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getPlusSound());

        radio.setPlusSound(0, 0, 10);
        assertEquals(1, radio.getPlusSound());
    }

    @Test
    public void soundPlus3 () {
        Radio radio = new Radio();
        assertEquals(0, radio.getPlusSound());

        radio.setPlusSound(5, 0, 10);
        assertEquals(6, radio.getPlusSound());
    }


    @Test
    public void soundMinus1() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinusSound());

        radio.setMinusSound(0, 0,10);
        assertEquals(0, radio.getMinusSound());
    }

    @Test
    public void soundMinus2() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinusSound());

        radio.setMinusSound(10, 0, 10);
        assertEquals(9, radio.getMinusSound());
    }

    @Test
    public void soundMinus3() {
        Radio radio = new Radio();
        assertEquals(0, radio.getMinusSound());

        radio.setMinusSound(5, 0, 10);
        assertEquals(4, radio.getMinusSound());
    }

}