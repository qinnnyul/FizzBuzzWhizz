package com.github.qinnnyul.game.utils;

import com.github.qinnnyul.game.constant.GameConstant;
import com.github.qinnnyul.game.exceptions.InvalidSpecialNumbers;
import com.google.common.base.Predicate;
import com.google.common.collect.Iterators;

import java.util.List;

import static com.github.qinnnyul.game.constant.GameConstant.SIZE_OF_NUMBERS;
import static com.google.common.collect.Sets.newHashSet;

public class SpecialNumberValidator
{
    public void validate(List<Integer> numbers)
    {
        if (isValidLength(numbers) || !isSingleDigitals(numbers)) {
            throw new InvalidSpecialNumbers();
        }
    }

    private boolean isValidLength(List<Integer> numbers)
    {
        return newHashSet(numbers).size() != SIZE_OF_NUMBERS;
    }

    private boolean isSingleDigitals(List<Integer> numbers)
    {
        return !Iterators.any(numbers.iterator(), new Predicate<Integer>()
        {
            @Override
            public boolean apply(Integer number)
            {
                return !GameConstant.RANGE.contains(number);
            }
        });
    }
}
