package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class FizzBuzzNumberProcessor extends NumberProcessor
{
    public FizzBuzzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number)
    {
        return isFizzBuzz(number) ? GameConstant.FIZZ + GameConstant.BUZZ : getNextProcessor().process(number);
    }

    private boolean isFizzBuzz(Integer number)
    {
        return number % 3 == 0 && number % 5 == 0;
    }
}
