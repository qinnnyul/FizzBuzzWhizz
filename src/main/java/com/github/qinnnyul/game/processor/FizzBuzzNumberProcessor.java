package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class FizzBuzzNumberProcessor extends NumberProcessor
{
    public FizzBuzzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.isFizzBuzz(number) ? GameConstant.FIZZ + GameConstant.BUZZ : getNextProcessor().process(number, specialNumbers);
    }

}
