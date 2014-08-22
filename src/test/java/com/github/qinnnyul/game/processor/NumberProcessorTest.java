package com.github.qinnnyul.game.processor;

import com.github.qinnnyul.game.model.NumberProcessorFactory;
import com.github.qinnnyul.game.model.Student;
import org.junit.Before;

public class NumberProcessorTest
{
    protected NumberProcessor numberProcessor;
    protected Student student;

    @Before
    public void setUp() throws Exception
    {
        numberProcessor = NumberProcessorFactory.build();
        student = new Student(7, numberProcessor);
    }
}
