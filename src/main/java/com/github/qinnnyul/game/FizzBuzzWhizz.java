package com.github.qinnnyul.game;

public class FizzBuzzWhizz
{

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String WHIZZ = "Whizz";

    public String countOff(Integer number)
    {
        StringBuilder stringBuilder = new StringBuilder();
        if (number.toString().contains(String.valueOf(3))) {
            return FIZZ;
        }
        if (number % 3 == 0) {
            stringBuilder.append(FIZZ);
        }
        if (number % 5 == 0) {
            stringBuilder.append(BUZZ);
        }
        if (number % 7 == 0) {
            stringBuilder.append(WHIZZ);
        }
        return stringBuilder.toString();
    }
}
