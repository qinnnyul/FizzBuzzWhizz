package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.model.NumberProcessorFactory;
import com.github.qinnnyul.game.model.Student;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzNumberProcessorTest extends NumberProcessorTest
{
    @Test
    public void should_return_fizzbuzz_when_student_count_is_multiple_of_3_and_5() throws Exception
    {
        // when
        String result = student.countOff(15);

        // then
        assertThat(result, is("FizzBuzz"));

    }
}
