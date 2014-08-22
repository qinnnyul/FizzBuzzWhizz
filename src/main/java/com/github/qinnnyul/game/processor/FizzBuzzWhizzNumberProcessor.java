package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class FizzBuzzWhizzNumberProcessor extends NumberProcessor
{
    public FizzBuzzWhizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.isFizzBuzzWhizz(number) ? GameConstant.FIZZ + GameConstant.BUZZ + GameConstant.WHIZZ
                : getNextProcessor().process(number, specialNumbers);
    }

}
