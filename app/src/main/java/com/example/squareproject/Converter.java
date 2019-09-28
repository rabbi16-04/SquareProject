package com.example.squareproject;

public class Converter
{
    private long ans;
    private char ch,operator;
    private long tmp1,tmp2;

    // Converts to celsius
    public String square(String fah)
    {
        int ans = Integer.parseInt(fah);
        ans = ans*ans;
        return Long.toString(ans);
    }
}
