package com.github.qinnnyul.game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FizzBuzzWhizzTest
{

    private FizzBuzzWhizz fizzBuzzWhizz;

    @Before
    public void setUp() throws Exception
    {
        fizzBuzzWhizz = new FizzBuzzWhizz();
    }

    @Test
    public void should_return_fizz_when_student_count_is_multiple_of_3() throws Exception
    {
        // when
        String result = fizzBuzzWhizz.countOff(3);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_when_student_count_is_4() throws Exception
    {
        // when
        String result = fizzBuzzWhizz.countOff(4);

        // then
        assertThat(result, is(String.valueOf(4)));
    }

    @Test
    public void should_return_buzz_when_student_count_is_multiple_of_5() throws Exception
    {
        // when
        String result = fizzBuzzWhizz.countOff(5);

        // then
        assertThat(result, is("Buzz"));

    }

    @Test
    public void should_return_whizz_when_student_count_is_multiple_of_7() throws Exception
    {
        // when
        String result = fizzBuzzWhizz.countOff(7);

        // then
        assertThat(result, is("Whizz"));

    }


//    @Test
//    public void should_return_fizzbuzz_when_student_count_is_multiple_of_3_and_5() throws Exception
//    {
//        // when
//        String result = fizzBuzzWhizz.countOff(15);
//
//        // then
//        assertThat(result, is("FizzBuzz"));
//
//    }
//
//    @Test
//    public void should_return_fizzbuzz_when_student_count_is_multiple_of_5_and_7() throws Exception
//    {
//        // when
//        String result = fizzBuzzWhizz.countOff(70);
//
//        // then
//        assertThat(result, is("BuzzWhizz"));
//
//    }
//
//    @Test
//    public void should_return_fizzbuzzwhizz_when_student_count_is_multiple_of_3_and_5_and_7() throws Exception
//    {
//        // when
//        String result = fizzBuzzWhizz.countOff(105);
//
//        // then
//        assertThat(result, is("FizzBuzzWhizz"));
//
//    }
//
//    @Test
//    public void should_return_fizz_when_student_count_contains_3() throws Exception
//    {
//        // when
//        String result = fizzBuzzWhizz.countOff(35);
//
//        // then
//        assertThat(result, is("Fizz"));
//
//    }

}
