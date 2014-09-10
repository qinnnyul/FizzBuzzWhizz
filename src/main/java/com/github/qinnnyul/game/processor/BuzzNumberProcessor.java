package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.model.SpecialNumbers;

public class BuzzNumberProcessor extends NumberProcessor
{

    public BuzzNumberProcessor(NumberProcessor numberProcessor)
    {
        super(numberProcessor);
    }

    @Override
    public String process(Integer number, SpecialNumbers specialNumbers)
    {
        return specialNumbers.isBuzz(number) ? GameConstant.BUZZ : getNextProcessor().process(number, specialNumbers);
    }

}
