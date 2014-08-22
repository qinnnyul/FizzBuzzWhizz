package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.model.SpecialNumbers;

public class CommonNumberProcessor extends NumberProcessor
{
    public CommonNumberProcessor()
    {
        super(null);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return number.toString();
    }
}
