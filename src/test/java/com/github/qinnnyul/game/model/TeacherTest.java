package com.github.qinnnyul.game.model;

import com.github.qinnnyul.game.exceptions.InvalidSpecialNumbers;
import com.github.qinnnyul.game.utils.SpecialNumberValidator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TeacherTest
{
    private final Teacher teacher = new Teacher(new SpecialNumberValidator());
    private final List<Integer> numbers = newArrayList();

    @Before
    public void setUp() throws Exception
    {
        numbers.add(3);
        numbers.add(5);
        numbers.add(7);
    }

    @Test
    public void should_give_these_special_numbers() throws Exception
    {
        // when
        SpecialNumbers specialNumbers = teacher.give(numbers);
        // then
        assertThat(specialNumbers == null, is(false));
    }

    @Test(expected = InvalidSpecialNumbers.class)
    public void should_throw_out_exceptions_when_the_length_of_given_number_is_invalid() throws Exception
    {
        // given
        numbers.add(10);
        // when
        teacher.give(numbers);
        // then
    }

    @Test(expected = InvalidSpecialNumbers.class)
    public void should_throw_out_exceptions_when_digital_of_given_number_is_invalid() throws Exception
    {
        // given
        List<Integer> numbers = newArrayList();
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);
        // when
        teacher.give(numbers);
    }
}
