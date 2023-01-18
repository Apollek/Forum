package com.example.demo.ForumPost;

import java.time.LocalDateTime;

public interface ForumPostWithUser {
    Integer getId();
    String getTopicName();
    String getContent();
    Integer getUserId();
    Integer getThreadId();
    LocalDateTime getDateOfCreation();
    LocalDateTime getDateOfLastEdit();
    Integer getItsMe();
}
