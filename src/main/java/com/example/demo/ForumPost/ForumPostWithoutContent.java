package com.example.demo.ForumPost;

import java.time.LocalDateTime;

public interface ForumPostWithoutContent{
    Integer getId();
    String getTopicName();
    Integer getUserId();
    Integer getThreadId();
    LocalDateTime getDateOfCreation();
    LocalDateTime getDateOfLastEdit();
}
