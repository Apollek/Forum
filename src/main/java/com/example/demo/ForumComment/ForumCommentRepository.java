package com.example.demo.ForumComment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ForumCommentRepository extends JpaRepository <ForumComment, Integer> {
    @Query("select f from ForumComment f where f.postId = ?1 order by f.dateOfCreation")
    List<ForumComment> findForumCommentsByPostId(int postId);

    @Query(
            nativeQuery = true,
            value = "select f.id, f.content as content, f.user_id as userId, f.post_id as postId," +
                    "f.date_of_creation as dateOfCreation, f.date_of_last_edit as dateOfLastEdit, (f.user_id = ?2) as itsMe" +
                    " from forum_comment f where f.post_id = ?1"
    )
    List<ForumCommentWithUser> findForumCommentsWithUserByPostId(int postId, int userId);

//    @Query("select f from ForumComment f where f.id = ?1")
//    Optional<ForumComment> findForumCommentById(int postId);
//    Optional<ForumComment> findForumCommentByIdAndUserId(int postId);
    @Query("select f from ForumComment f where f.id = ?1 and f.userId = ?2")
    Optional<ForumComment> findForumCommentByIdAndUserId(int commentId, int userId);
}
