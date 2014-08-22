package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class FizzNumberProcessor extends NumberProcessor
{
    public FizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.isFizz(number) ? GameConstant.FIZZ : getNextProcessor().process(number, specialNumbers);
    }

}
