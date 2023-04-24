package ru.netology.service;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void remainLowerLimit() {
        int amount = 0;
        int actual = 1000;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void remainUpLowerLimit() {
        int amount = 1;
        int actual = 999;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void remainMiddleLimit() {
        int amount = 500;
        int actual = 500;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void remainLowUpperLimit() {
        int amount = 999;
        int actual = 1;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }
    @Test
    public void remainUpperLimit() {
        int amount = 1000;
        int actual = 0;
        int expected = service.remain(amount);

        assertEquals(actual, expected);
    }

}