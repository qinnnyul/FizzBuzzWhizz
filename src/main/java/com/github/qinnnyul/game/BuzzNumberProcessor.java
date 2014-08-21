package com.github.qinnnyul.game;

public class BuzzNumberProcessor extends NumberProcessor
{

    @Override
    public String process(Integer number)
    {
        return ((number % 5) == 0) ? GameConstant.BUZZ : number.toString();
    }
}
