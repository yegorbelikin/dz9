package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();


//    @Test
//    public void shouldSetStationDefault() {
//
//        radio.setCurrentStation(5);
//
//        int expected = 5;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetMaxStationDefault() {
//
//        radio.setCurrentStation(9);
//        int expected = 9;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }
//
//    @Test
//    public void shouldSetAboveMaxStationDefault() {
//
//        radio.setCurrentStation(10);
//        int expected = 0;
//        int actual = radio.getCurrentStation();
//
//        Assertions.assertEquals(expected, actual);
//    }

    @Test
    public void shouldSetStation() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(15);
        int expected = 15;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxStation() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(19);
        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetAboveMaxStation() {

        Radio radio = new Radio(20);

        radio.setCurrentStation(20);
        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }



    @Test
    public void shouldNotSetStationAboveMaxDefault() {

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMaxDefault() {

        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationBelowMaxDefault() {

        radio.setCurrentStation(8);

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationAboveMin() {

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetStationMin() {

        radio.setCurrentStation(0);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldNotSetStationBelowMin() {

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationDefault() {

        radio.setCurrentStation(5);
        radio.nextStation();

        int expected = 6;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationBelowMaxDefault() {

        radio.setCurrentStation(8);
        radio.nextStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAboveMaxDefault() {

        radio.setCurrentStation(9);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setNextStation() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(17);
        radio.nextStation();

        int expected = 18;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationBelowMax() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(18);
        radio.nextStation();

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAboveMax() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(19);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void setPrevStation() {


        radio.setCurrentStation(5);
        radio.prevStation();

        int expected = 4;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationBelowMin() {
        Radio radio = new Radio(20);

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 19;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationBelowMinDefault() {

        radio.setCurrentStation(0);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationAboveMin() {


        radio.setCurrentStation(1);
        radio.prevStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {

        radio.setVolume(51);

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetVolumeBelowMax() {

        radio.setVolume(99);

        int expected = 99;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax() {

        radio.setVolume(100);

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeAboveMin() {

        radio.setVolume(1);

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin() {

        radio.setVolume(0);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {

        radio.setVolume(-1);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {


        radio.setVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {

        radio.setVolume(100);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeBelowMax() {

        radio.setVolume(99);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {

        radio.setVolume(5);
        radio.reduceVolume();

        int expected = 4;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMin() {


        radio.setVolume(0);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeAboveMin() {

        radio.setVolume(1);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


}