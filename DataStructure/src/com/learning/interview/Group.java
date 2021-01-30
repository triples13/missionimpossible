package com.learning.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Group {

    private String groupName;
    private List<User> userList;


    Group(String groupName){
        this.groupName = groupName;
        userList= new ArrayList<>();
    }

    public void addUser(User user){
        this.userList.add(user);
    }

    public int checkGroupSize(){
        return  this.userList.size();
    }

    public List<User> getUser() {
        return userList;
    }



    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Group{" +
                "groupName='" + groupName + '\'' +
                '}';
    }
}

