package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class BuzzNumberProcessor extends NumberProcessor
{

    public BuzzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number)
    {
        return ((number % 5) == 0) ? GameConstant.BUZZ : getNextProcessor().process(number);
    }
}
