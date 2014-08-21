package com.github.qinnnyul.game;

public class Student
{
    private NumberProcessor numberProcessor;

    public Student(NumberProcessor numberProcessor)
    {
        this.numberProcessor = numberProcessor;
    }

    public String countOff(Integer number)
    {
        return numberProcessor.process(number);
    }
}
