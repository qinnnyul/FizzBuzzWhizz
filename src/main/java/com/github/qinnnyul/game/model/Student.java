package com.github.qinnnyul.game.model;

import com.github.qinnnyul.game.processor.NumberProcessor;

public class Student
{
    private SpecialNumbers specialNumbers;
    private NumberProcessor numberProcessor;

    public Student(SpecialNumbers specialNumbers, NumberProcessor numberProcessor)
    {
        this.specialNumbers = specialNumbers;
        this.numberProcessor = numberProcessor;
    }

    public String countOff(Integer number)
    {
        return numberProcessor.process(number, specialNumbers);
    }

}
