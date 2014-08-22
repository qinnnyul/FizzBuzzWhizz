package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.model.SpecialNumbers;

public abstract class NumberProcessor
{
    private NumberProcessor numberProcessor;

    public NumberProcessor(NumberProcessor numberProcessor)
    {
        this.numberProcessor = numberProcessor;
    }

    public abstract String process(Integer number, SpecialNumbers specialNumbers);

    public NumberProcessor getNextProcessor()
    {
        return numberProcessor;
    }
}
