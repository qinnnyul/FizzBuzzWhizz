package com.github.qinnnyul.game;

import com.github.qinnnyul.game.model.Student;

import java.util.List;

public class FizzBuzzWhizzMain
{
    private List<Student> studentList;

    public FizzBuzzWhizzMain(List<Student> studentList)
    {
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
