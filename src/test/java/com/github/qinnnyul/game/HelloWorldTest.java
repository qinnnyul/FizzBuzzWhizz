package com.github.qinnnyul.game;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class HelloWorldTest
{
    @Test
    public void should_say_hello_world() throws Exception
    {
        // given
        HelloWorld helloWorld = new HelloWorld();
        // when
        String words = helloWorld.say();
        // then
        assertThat(words, is("helloworld"));
    }

}
