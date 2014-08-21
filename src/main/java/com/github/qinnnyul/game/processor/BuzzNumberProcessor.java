package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class BuzzNumberProcessor extends NumberProcessor
{

    @Override
    public String process(Integer number)
    {
        return ((number % 5) == 0) ? GameConstant.BUZZ : number.toString();
    }
}
