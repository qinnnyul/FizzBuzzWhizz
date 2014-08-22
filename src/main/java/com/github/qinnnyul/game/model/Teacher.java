package com.github.qinnnyul.game.model;

import com.github.qinnnyul.game.utils.SpecialNumberValidator;

import java.util.List;

public class Teacher
{
    public Teacher(SpecialNumberValidator specialNumberValidator)
    {
        this.specialNumberValidator = specialNumberValidator;
    }

    private SpecialNumberValidator specialNumberValidator;

    public SpecialNumbers give(List<Integer> numbers)
    {
        specialNumberValidator.validate(numbers);
        return new SpecialNumbers(numbers.get(0), numbers.get(1), numbers.get(2));
    }
}
