package ru.netology.service;


import static org.testng.Assert;

public class CashbackHackServiceTest {

    @org.testng.annotations.TestTest

    public void shouldEarnCashback(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;
        
        assertEguals(expected, actual);
    }
    @org.testng.annotations.TestTest
    public void shouldNotEarnCashback(){
        CashbackHackService service = new CashbackHackService();
        int amount = 900;

        int actual = service.remain(amount);
        int expected = 100;

        assertEguals(expected, actual);
    }
}
