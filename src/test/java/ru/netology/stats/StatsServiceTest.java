package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldSum(){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        StatsService service = new StatsService();
        int actual = service.sum(purchases);
        assertEquals(expected,actual);
    }
    @Test
    void shouldAverage(){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        StatsService service = new StatsService();
        int actual = service.average(purchases);
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnMonthMax(){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        StatsService service = new StatsService();
        int actual = service.MonthMax(purchases);
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnMonthMin(){
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        StatsService service = new StatsService();
        int actual = service.MonthMin(purchases);
        assertEquals(expected,actual);
    }
    @Test
    void shouldReturnMonthCountLessAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.MonthCountLessAverage(purchases);
        assertEquals(expected, actual);
    }
    @Test
    void shouldReturnMonthCountMoreAverage() {
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        StatsService service = new StatsService();
        int actual = service.MonthCountMoreAverage(purchases);
        assertEquals(expected, actual);
    }
}