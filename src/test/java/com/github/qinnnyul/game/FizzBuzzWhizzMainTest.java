package com.github.qinnnyul.game;

import com.github.qinnnyul.game.model.SpecialNumbers;
import com.github.qinnnyul.game.model.Student;
import com.github.qinnnyul.game.model.Teacher;
import com.github.qinnnyul.game.processor.NumberProcessor;
import com.github.qinnnyul.game.utils.NumberProcessorFactory;
import org.junit.Test;

import java.util.List;

import static com.google.common.collect.Lists.newArrayList;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class FizzBuzzWhizzMainTest
{
    @Test
    public void should_start_the_game() throws Exception
    {
        // given
        Teacher teacher = mock(Teacher.class);
        SpecialNumbers specialNumbers = new SpecialNumbers(3, 5, 7);
        when(teacher.give(any(List.class))).thenReturn(specialNumbers);

        List<Student> students = newArrayList();
        NumberProcessor numberProcessor = NumberProcessorFactory.build();
        students.add(new Student(specialNumbers, numberProcessor));
        students.add(new Student(specialNumbers, numberProcessor));
        students.add(new Student(specialNumbers, numberProcessor));
        students.add(new Student(specialNumbers, numberProcessor));
        students.add(new Student(specialNumbers, numberProcessor));
        students.add(new Student(specialNumbers, numberProcessor));
        students.add(new Student(specialNumbers, numberProcessor));

        FizzBuzzWhizzMain game = new FizzBuzzWhizzMain(students);
        // when
        game.start();
    }
}
