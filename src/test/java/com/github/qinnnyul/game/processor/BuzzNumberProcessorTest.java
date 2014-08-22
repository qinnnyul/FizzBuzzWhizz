package com.github.qinnnyul.game.processor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class BuzzNumberProcessorTest extends NumberProcessorTest
{

    @Test
    public void should_return_buzz_when_student_count_is_multiple_of_5() throws Exception
    {
        // when
        String result = student.countOff(5);

        // then
        assertThat(result, is("Buzz"));

    }

}
