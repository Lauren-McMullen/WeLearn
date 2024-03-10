package com.example.welearn.userdata;

import java.util.ArrayList;

public class AppUsers {

    private ArrayList<User> allUsers;

    public AppUsers() {
        allUsers = new ArrayList<>();
    }

    public void addUser(User toAdd) {
        allUsers.add(toAdd);
    }

    public User findCurrentUser(String username) {
        for(User u: allUsers) {
            if (u.getUsername().equals(username)) {
                return u;
            }
        }
        return null;
    }



}
