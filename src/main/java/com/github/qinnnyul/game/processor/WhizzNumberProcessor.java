package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;

public class WhizzNumberProcessor extends NumberProcessor
{
    @Override
    public String process(Integer number)
    {
        return ((number % 7) == 0) ? GameConstant.WHIZZ : number.toString();
    }
}
