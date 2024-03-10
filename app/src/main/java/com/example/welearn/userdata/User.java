package com.example.welearn.userdata;

import java.util.ArrayList;

public class User {

    private String username;
    private String name_first;
    private String name_last;
    private String password;
    private ArrayList<Session> studentSessions;
    private ArrayList<Session> teacherSessions;

    public User(String username, String password, String name_first, String name_last) {
        this.username = username;
        this.password = password;
        this.name_first = name_first;
        this.name_last = name_last;
        studentSessions = new ArrayList<>();
        teacherSessions = new ArrayList<>();
    }

    public void addSession(Session session, role role) {
        if (role == com.example.welearn.userdata.role.TEACHER) {
            teacherSessions.add(session);
        } else {
            studentSessions.add(session);
        }
    }

    public ArrayList<Session> getStudentSessions() {
        return studentSessions;
    }

    public void setStudentSessions(ArrayList<Session> studentSessions) {
        this.studentSessions = studentSessions;
    }

    public ArrayList<Session> getTeacherSessions() {
        return teacherSessions;
    }

    public void setTeacherSessions(ArrayList<Session> teacherSessions) {
        this.teacherSessions = teacherSessions;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getName_first() {
        return name_first;
    }

    public void setName_first(String name_first) {
        this.name_first = name_first;
    }

    public String getName_last() {
        return name_last;
    }

    public void setName_last(String name_last) {
        this.name_last = name_last;
    }
}
