package com.github.qinnnyul.game.model;

public class SpecialNumbers
{
    private int secondNumber = 5;
    private int thirdNumber = 7;
    private int firstNumber = 3;

    public SpecialNumbers(int firstNumber, int secondNumber, int thirdNumber)
    {
        this.secondNumber = secondNumber;
        this.thirdNumber = thirdNumber;
        this.firstNumber = firstNumber;
    }

    public boolean isBuzzWhizz(Integer number)
    {
        return number % secondNumber == 0 && number % thirdNumber == 0;
    }

    public boolean isBuzz(Integer number)
    {
        return number % secondNumber == 0;
    }

    public boolean isFizzBuzz(Integer number)
    {
        return number % firstNumber == 0 && number % secondNumber == 0;
    }

    public boolean isFizzBuzzWhizz(Integer number)
    {
        return number % firstNumber == 0 && number % secondNumber == 0 && number % thirdNumber == 0;
    }

    public boolean isFizz(Integer number)
    {
        return number % firstNumber == 0;
    }

    public boolean hasContainFirstSpecialNumber(Integer number)
    {
        return number.toString().contains(String.valueOf(firstNumber));
    }

    public boolean isWhizz(Integer number)
    {
        return number % thirdNumber == 0;
    }
}
