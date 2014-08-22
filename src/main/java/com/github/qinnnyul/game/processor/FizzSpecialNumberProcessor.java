package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class FizzSpecialNumberProcessor extends NumberProcessor
{
    public FizzSpecialNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.hasContainFirstSpecialNumber(number) ? GameConstant.FIZZ : getNextProcessor().process(number, specialNumbers);
    }

}
