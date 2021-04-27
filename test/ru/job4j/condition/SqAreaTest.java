package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Square3() {
        int expected = 3;
        int p = 8;
        double k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP24K8Square14() {
        int expected = 14;
        int p = 24;
        double k = 8;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.3);
    }

    @Test
    public void whenP2K2Square0() {
        int expected = 0;
        int p = 2;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.3);
    }



}