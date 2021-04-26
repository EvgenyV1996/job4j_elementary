package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void rubleToEuro() {
        int in = 140;
        int excepted = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(excepted, out);
    }

    @Test
    public void rubleToDollar() {
        int in = 120;
        int excepted = 2;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(excepted, out);
    }
}