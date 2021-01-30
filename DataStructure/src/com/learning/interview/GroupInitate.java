package com.learning.interview;

import java.util.*;

public class GroupInitate {

    // all avilable groups irreespective of who created it
    private Set<Group> groupSet;
    // group pertaining to who created it
    private Map<User,Set<Group>> groupMap;

    GroupInitate(){
        groupSet=new HashSet<>();
        groupMap= new HashMap<>();
    }
    // 1 more user role

    //a(admin),b->5 groups ,c->1 group

    public void createGroup(String groupName,User user){

       // to check is user creates group without searching
        Group groupToBeAdded = searchGroup(groupName);
        // first check  if user is allowed to create group and group is allowing members
       if(groupToBeAdded!=null) {
           if (checkUserAllowedToCreateGroup(user) && checkIfGroupIsAllowingMembers(groupToBeAdded)) {

               if (groupMap.containsKey(user)) {
                   // add to exisiting group

                   Set<Group> groups = groupMap.get(user);
                   // check if that group is allowing member

                   groups.add(groupToBeAdded);
                   groupMap.put(user,groups);

                   // user added in already exisitng group
                   groupToBeAdded.addUser(user);
                   // no need to add in set

               }
               // user has no groups associated with it
               else {

                   Set<Group> groupSet = new HashSet<>();
                   groupSet.add(groupToBeAdded);
                   groupMap.put(user,groupSet);

                   groupToBeAdded.addUser(user);
               }

           }
       }
       else{

           // if groupName is null need to do only 1 validation on user permission

           if (checkUserAllowedToCreateGroup(user)){
               Group newGroup = new Group(groupName);
               //get groups of user
               Set<Group> userGroups = groupMap.get(user);
               userGroups.add(newGroup);
               groupMap.put(user,userGroups);

               newGroup.addUser(user);
               //add this user to global groupset
               groupSet.add(newGroup);
           }

       }

    }
    public boolean checkIfGroupIsAllowingMembers(Group group){

        return checkGroupSize(group)<50?true:false;
    }


    private int checkGroupSize(Group group){

       return group.checkGroupSize();
    }


    public Group searchGroup(String groupName) {

        Group group=null;

        if(groupSet.contains(groupName)){

            Iterator iterator = groupSet.iterator();
            while (iterator.hasNext()){

               Group group1= (Group) iterator.next();
                if(group1.getGroupName().equals(groupName))
                {
                    group=group1;
                }
            }
        }
        else{
            throw new IllegalArgumentException("no group exist create new group");
        }

        if(group!=null)
            System.out.println("group name :"+group.getGroupName());
        return  group;
    }


    private boolean checkUserAllowedToCreateGroup(User user){

        if(groupMap.containsKey(user))
        {
           if( groupMap.get(user).size()<50)
               return  true;
           else
               return false;

        }


       return true;
    }
}
