package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class WhizzNumberProcessor extends NumberProcessor
{
    public WhizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.isWhizz(number) ? GameConstant.WHIZZ : getNextProcessor().process(number, specialNumbers);
    }

}
