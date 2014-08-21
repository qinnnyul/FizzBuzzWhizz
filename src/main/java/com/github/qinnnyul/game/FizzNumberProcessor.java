package com.github.qinnnyul.game;

public class FizzNumberProcessor extends NumberProcessor
{
    @Override
    public String process(Integer number)
    {
        return ((number % 3) == 0) ? GameConstant.FIZZ : number.toString();
    }
}
