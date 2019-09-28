package com.example.squareproject;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConverterTest {

    @Test
    public void square()
    {
        int input = 20;
        int output;
        int expected = 400;

        Converter cn = new Converter();
        String str = Integer.toString(input);
        output = Integer.parseInt(cn.square(str));

        System.out.println(output);
        assertEquals(expected,output);
    }
}