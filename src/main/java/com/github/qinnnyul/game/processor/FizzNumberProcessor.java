package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class FizzNumberProcessor extends NumberProcessor
{
    public FizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number)
    {
        return ((number % 3) == 0) ? GameConstant.FIZZ : getNextProcessor().process(number);
    }
}
