package com.example.demo.ForumComment;

import com.example.demo.ForumPost.ForumPost;

import java.time.LocalDateTime;

public interface ForumCommentWithUser {
    Integer getId();
    String getContent();
    Integer getUserId();
    ForumPost getPost();
    LocalDateTime getDateOfCreation();
    LocalDateTime getDateOfLastEdit();
    Integer getItsMe();
}
