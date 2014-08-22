package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class FizzBuzzWhizzNumberProcessor extends NumberProcessor
{
    public FizzBuzzWhizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number)
    {
        return isFizzBuzzWhizz(number) ? GameConstant.FIZZ + GameConstant.BUZZ + GameConstant.WHIZZ : getNextProcessor().process(number);
    }

    private boolean isFizzBuzzWhizz(Integer number)
    {
        return number % 3 == 0 && number % 5 == 0 && number % 7 == 0;
    }
}
