package com.example.welearn.userdata;

import java.util.ArrayList;

public class Session {

    private topic topic;
    private month month;
    private int day;
    private int year;
    private int rating;
    private User teacher;
    private level level;
    private ArrayList<User> students;

    public Session(topic topic, month month, int day, int year, int rating,
                   User teacher, ArrayList<User> students, level level) {
        this.topic = topic;
        this.month = month;
        this.day = day;
        this.year = year;
        this.rating = rating;
        this.teacher = teacher;
        this.students = students;
        this.level = level;

    }

    public void addStudent(User student) {
        students.add(student);
    }


}
