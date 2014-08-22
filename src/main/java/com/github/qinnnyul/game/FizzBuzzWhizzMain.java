package com.github.qinnnyul.game;

import com.github.qinnnyul.game.model.SpecialNumbers;
import com.github.qinnnyul.game.model.Student;
import com.github.qinnnyul.game.model.Teacher;

import java.util.Arrays;
import java.util.List;

public class FizzBuzzWhizzMain
{
    private Teacher teacher;

    private List<Student> studentList;

    public FizzBuzzWhizzMain(Teacher teacher, List<Student> studentList)
    {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public void start()
    {
        for (int i = 0; i < studentList.size(); i++) {
            Integer number = i + 1;
            System.out.println(studentList.get(i).countOff(number));
        }
    }
}
