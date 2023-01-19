package com.example.demo.ForumComment;

import com.example.demo.ForumPost.ForumPost;
import com.example.demo.User.User;

import java.time.LocalDateTime;

public interface ForumCommentWithUser {
    Integer getId();
    String getContent();
    User getUser();
    ForumPost getPost();
    LocalDateTime getDateOfCreation();
    LocalDateTime getDateOfLastEdit();
    Integer getItsMe();
}
