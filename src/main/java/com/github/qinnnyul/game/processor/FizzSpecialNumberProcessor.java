package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class FizzSpecialNumberProcessor extends NumberProcessor
{
    public FizzSpecialNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number)
    {
        return number.toString().contains(String.valueOf(3)) ? GameConstant.FIZZ : getNextProcessor().process(number);
    }
}
