package com.github.qinnnyul.game;

import static com.github.qinnnyul.game.GameConstant.FIZZ;
import static com.github.qinnnyul.game.GameConstant.BUZZ;
import static com.github.qinnnyul.game.GameConstant.WHIZZ;

public class FizzBuzzWhizz
{
    public String countOff(Integer number)
    {
        if (number % 3 == 0) {
            return FIZZ;
        }
        if (number % 5 == 0) {
            return BUZZ;
        }
        if (number % 7 == 0) {
            return WHIZZ;
        }
        return number.toString();
    }
}
