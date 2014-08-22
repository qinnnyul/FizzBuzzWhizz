package com.github.qinnnyul.game.processor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class CommonNumberProcessorTest extends NumberProcessorTest
{
    @Test
    public void should_return_4_when_student_count_is_4() throws Exception
    {
        // when
        String result = student.countOff(4);

        // then
        assertThat(result, is(String.valueOf(4)));
    }
}
