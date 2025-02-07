package com.example.couseplusplus.data.comment;

import com.example.couseplusplus.model.comment.Comment;
import com.google.firebase.database.DataSnapshot;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * @author Yuki Misumi (u7582380)
 */
public class CommentCreator {
  public static Comment create(DataSnapshot snapshot, String courseCode) {
    FirebaseComment value =
        Objects.requireNonNull(
            snapshot.getValue(FirebaseComment.class), "Failed to get comment data");
    return new Comment(
        snapshot.getKey(),
        courseCode,
        value.year,
        value.semester,
        value.text,
        value.helpfulness,
        LocalDateTime.parse(value.postedDateTime));
  }
}
