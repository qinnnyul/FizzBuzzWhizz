package com.github.qinnnyul.game.model;

import com.github.qinnnyul.game.processor.BuzzNumberProcessor;
import com.github.qinnnyul.game.processor.BuzzWhizzNumberProcessor;
import com.github.qinnnyul.game.processor.CommonNumberProcessor;
import com.github.qinnnyul.game.processor.FizzBuzzNumberProcessor;
import com.github.qinnnyul.game.processor.FizzBuzzWhizzNumberProcessor;
import com.github.qinnnyul.game.processor.FizzNumberProcessor;
import com.github.qinnnyul.game.processor.FizzSpecialNumberProcessor;
import com.github.qinnnyul.game.processor.NumberProcessor;
import com.github.qinnnyul.game.processor.WhizzNumberProcessor;

public final class NumberProcessorFactory
{
    private NumberProcessorFactory()
    {
    }

    public static NumberProcessor build()
    {
        FizzNumberProcessor fizzNumberProcessor = new FizzNumberProcessor(new CommonNumberProcessor());
        BuzzNumberProcessor buzzNumberProcessor = new BuzzNumberProcessor(fizzNumberProcessor);
        WhizzNumberProcessor whizzNumberProcessor = new WhizzNumberProcessor(buzzNumberProcessor);
        FizzBuzzNumberProcessor fizzBuzzNumberProcessor = new FizzBuzzNumberProcessor(whizzNumberProcessor);
        BuzzWhizzNumberProcessor buzzWhizzNumberProcessor = new BuzzWhizzNumberProcessor(fizzBuzzNumberProcessor);
        FizzBuzzWhizzNumberProcessor fizzBuzzWhizzNumberProcessor = new FizzBuzzWhizzNumberProcessor(buzzWhizzNumberProcessor);
        return new FizzSpecialNumberProcessor(fizzBuzzWhizzNumberProcessor);
    }
}
