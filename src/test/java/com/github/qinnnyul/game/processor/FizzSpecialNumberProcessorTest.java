package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.constant.GameConstant;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzSpecialNumberProcessorTest extends NumberProcessorTest
{
    @Test
    public void should_return_3_when_student_count_number_contains_3() throws Exception
    {
        // when
        String result = student.countOff(30);
        // then
        assertThat(result, is(GameConstant.FIZZ));
    }
}
