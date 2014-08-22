package com.github.qinnnyul.game.model;

public class SpecialNumbers
{

    public boolean isBuzzWhizz(Integer number)
    {
        return number % 5 == 0 && number % 7 == 0;
    }

    public boolean isBuzz(Integer number)
    {
        return ((number % 5) == 0);
    }

    public boolean isFizzBuzz(Integer number)
    {
        return number % 3 == 0 && number % 5 == 0;
    }

    public boolean isFizzBuzzWhizz(Integer number)
    {
        return number % 3 == 0 && number % 5 == 0 && number % 7 == 0;
    }

    public boolean isFizz(Integer number)
    {
        return ((number % 3) == 0);
    }

    public boolean hasContainFirstSpecialNumber(Integer number)
    {
        return number.toString().contains(String.valueOf(3));
    }

    public boolean isWhizz(Integer number)
    {
        return ((number % 7) == 0);
    }
}
