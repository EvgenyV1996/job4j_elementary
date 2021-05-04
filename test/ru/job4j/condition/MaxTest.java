package ru.job4j.condition;

import org.junit.Test;

import org.junit.Assert;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax100To34Then100() {
        int left = 100;
        int right = 34;
        int result = Max.max(left, right);
        int expected = 100;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax1To95Then95() {
        int left = 1;
        int right = 95;
        int result = Max.max(left, right);
        int expected = 95;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        int expected = 10;
        Assert.assertEquals(result, expected);
    }

}