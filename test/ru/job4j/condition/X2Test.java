package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import static org.junit.Assert.*;

public class X2Test {

    @Test
    public void calc() {

        int[][] values = {{1, 1, 1, 1, 3},
                            {0, 1, 1, 1, 2},
                            {1, 1, 0, 1, 2},
                            {1, 1, 1, 0, 1}};

        for (int i = 0; i < values.length; i++){
            int a = values[i][0];
            int b = values[i][1];
            int c = values[i][2];
            int x = values[i][3];
            int expected = values[i][4];
            int rsl = X2.calc(a, b, c, x);
            /* сравнение полученного значения с ожидаемым */
            Assert.assertEquals(expected, rsl);
        }

    }
}