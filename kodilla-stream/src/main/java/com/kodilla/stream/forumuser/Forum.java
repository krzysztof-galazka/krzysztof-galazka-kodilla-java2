package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    public List<ForumUser> forumUserList = new ArrayList<>();

    public Forum(){
        forumUserList.add(new ForumUser(1,"User1", 'M', 1991,10,15, 5));
        forumUserList.add(new ForumUser(2,"User2", 'F', 1994,11,2, 1));
        forumUserList.add(new ForumUser(3,"User3", 'M', 1995,8,2, 0));
        forumUserList.add(new ForumUser(4,"User4", 'M', 1992,3,4, 6));
        forumUserList.add(new ForumUser(5,"User5", 'F', 1999,6,8,9));
    }

    public List<ForumUser> getForumUserList(){
        return new ArrayList<>(forumUserList);
    }
}
