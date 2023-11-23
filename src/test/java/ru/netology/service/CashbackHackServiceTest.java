package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void boughtMoreThanFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1500;

        int actual = service.remain(amount);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void boughtFor1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(expected, actual);
    }
}