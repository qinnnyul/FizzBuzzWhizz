package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class BuzzWhizzNumberProcessor extends NumberProcessor
{
    public BuzzWhizzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.isBuzzWhizz(number) ? GameConstant.BUZZ + GameConstant.WHIZZ : getNextProcessor().process(number, specialNumbers);
    }

}
