package com.github.qinnnyul.game.model;

import com.github.qinnnyul.game.processor.NumberProcessor;

public class Student
{
    private Integer number;
    private NumberProcessor numberProcessor;

    public Student(Integer number, NumberProcessor numberProcessor)
    {
        this.number = number;
        this.numberProcessor = numberProcessor;
    }

    public String countOff(Integer number)
    {
        return numberProcessor.process(number);
    }
}
