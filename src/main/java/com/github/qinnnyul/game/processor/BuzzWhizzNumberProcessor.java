package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class BuzzWhizzNumberProcessor extends NumberProcessor
{
    public BuzzWhizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number)
    {
        return isBuzzWhizz(number) ? GameConstant.BUZZ + GameConstant.WHIZZ : getNextProcessor().process(number);
    }

    private boolean isBuzzWhizz(Integer number)
    {
        return number % 5 == 0 && number % 7 == 0;
    }
}
