package com.github.qinnnyul.game.processor;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class WhizzNumberProcessorTest extends NumberProcessorTest
{
    @Test
    public void should_return_whizz_when_student_count_is_multiple_of_7() throws Exception
    {
        // when
        String result = student.countOff(7);

        // then
        assertThat(result, is("Whizz"));

    }


}
