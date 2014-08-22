package com.github.qinnnyul.game.processor;

public class CommonNumberProcessor extends NumberProcessor
{
    public CommonNumberProcessor()
    {
        super(null);
    }

    @Override
    public String process(Integer number)
    {
        return number.toString();
    }
}
