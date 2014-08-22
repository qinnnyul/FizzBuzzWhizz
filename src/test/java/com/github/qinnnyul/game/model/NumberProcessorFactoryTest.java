package com.github.qinnnyul.game.model;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class NumberProcessorFactoryTest
{
    @Test
    public void should_return_a_instance_of_numberprocessor() throws Exception
    {
        // when
        Constructor<?>[] declaredConstructors = NumberProcessorFactory.class.getDeclaredConstructors();
        declaredConstructors[0].setAccessible(true);
        declaredConstructors[0].newInstance();
    }
}
