package com.github.qinnnyul.game;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StudentTest
{

    private Student student;

    @Before
    public void setUp() throws Exception
    {
    }

    @Test
    public void should_return_fizz_when_student_count_is_multiple_of_3() throws Exception
    {
        student = new Student(new FizzNumberProcessor());
        // when
        String result = student.countOff(3);

        // then
        assertThat(result, is("Fizz"));
    }

    @Test
    public void should_return_fizz_when_student_count_is_4() throws Exception
    {
        student = new Student(new CommonNumberProcessor());
        // when
        String result = student.countOff(4);

        // then
        assertThat(result, is(String.valueOf(4)));
    }

    @Test
    public void should_return_buzz_when_student_count_is_multiple_of_5() throws Exception
    {
        student = new Student(new BuzzNumberProcessor());
        // when
        String result = student.countOff(5);

        // then
        assertThat(result, is("Buzz"));

    }

    @Test
    public void should_return_whizz_when_student_count_is_multiple_of_7() throws Exception
    {
        student = new Student(new WhizzNumberProcessor());
        // when
        String result = student.countOff(7);

        // then
        assertThat(result, is("Whizz"));

    }


//    @Test
//    public void should_return_fizzbuzz_when_student_count_is_multiple_of_3_and_5() throws Exception
//    {
//        // when
//        String result = student.countOff(15);
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
//        String result = student.countOff(70);
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
//        String result = student.countOff(105);
//
//        // then
//        assertThat(result, is("Student"));
//
//    }
//
//    @Test
//    public void should_return_fizz_when_student_count_contains_3() throws Exception
//    {
//        // when
//        String result = student.countOff(35);
//
//        // then
//        assertThat(result, is("Fizz"));
//
//    }

}
