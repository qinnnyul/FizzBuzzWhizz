package com.github.qinnnyul.game.processor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzNumberProcessorTest extends NumberProcessorTest
{
    @Test
    public void should_return_fizz_when_student_count_is_multiple_of_3() throws Exception
    {
        // when
        String result = student.countOff(6);

        // then
        assertThat(result, is("Fizz"));
    }

}
