package ru.netology;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {

    @Test

    public void setCurrentStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(6);
        assertEquals(6, radio.getCurrentStation());
    }

    @Test

    public void checkMaxStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(11);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test

    public void checkMinStation(){
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        assertEquals(9, radio.getCurrentStation());

    }




}