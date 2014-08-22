package com.github.qinnnyul.game.processor;

public abstract class NumberProcessor
{
    private NumberProcessor numberProcessor;

    public NumberProcessor(NumberProcessor numberProcessor)
    {
        this.numberProcessor = numberProcessor;
    }

    public abstract String process(Integer number);

    public NumberProcessor getNextProcessor()
    {
        return numberProcessor;
    }
}
