package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(11);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-2);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStation() {
        Radio radio = new Radio();
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.nextStation();

        int expected = 3;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setNextStationAboveMax() {
        Radio radio = new Radio();
        int currentStation = 9;
        radio.setCurrentStation(currentStation);
        radio.nextStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStation() {
        Radio radio = new Radio();
        int currentStation = 2;
        radio.setCurrentStation(currentStation);
        radio.prevStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setPrevStationBelowMin() {
        Radio radio = new Radio();
        int currentStation = 0;
        radio.setCurrentStation(currentStation);
        radio.prevStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setVolume(51);

        int expected = 51;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setVolume(101);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setVolume(-2);

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio radio = new Radio();
        int volume = 2;
        radio.setVolume(volume);
        radio.increaseVolume();

        int expected = 3;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeAboveMax() {
        Radio radio = new Radio();
        int volume = 100;
        radio.setVolume(volume);
        radio.increaseVolume();

        int expected = 100;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolume() {
        Radio radio = new Radio();
        int volume = 2;
        radio.setVolume(volume);
        radio.reduceVolume();

        int expected = 1;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeBelowMin() {
        Radio radio = new Radio();
        int volume = 0;
        radio.setVolume(volume);
        radio.reduceVolume();

        int expected = 0;
        int actual = radio.getVolume();

        Assertions.assertEquals(expected, actual);
    }


}
