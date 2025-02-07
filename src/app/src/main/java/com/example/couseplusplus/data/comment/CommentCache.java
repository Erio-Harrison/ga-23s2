package com.example.couseplusplus.data.comment;

import com.example.couseplusplus.data.avl.AVLTree;
import com.example.couseplusplus.data.invertedindex.InvertedIndex;
import com.example.couseplusplus.data.invertedindex.StringInvertedIndex;
import com.example.couseplusplus.model.comment.Comment;
import java.util.List;

/**
 * @author Yuki Misumi (u7582380)
 */
public class CommentCache {
  List<Comment> comments;
  AVLTree<Integer, Comment> helpfulTree;
  AVLTree<String, Comment> enrolTree;
  AVLTree<String, Comment> postedTree;
  InvertedIndex<String, Comment> textIndex;

  public CommentCache(List<Comment> comments) {
    this.comments = comments;
    helpfulTree = new AVLTree<>();
    enrolTree = new AVLTree<>();
    postedTree = new AVLTree<>();
    textIndex = new StringInvertedIndex<>();

    comments.forEach(
        comment -> {
          helpfulTree.insert(comment.helpfulness(), comment);
          enrolTree.insert(comment.enrolKey(), comment);
          postedTree.insert(comment.postedDateTime().toString(), comment);
          comment.words().forEach(word -> textIndex.add(word, comment));
        });
  }

  public List<Comment> comments() {
    return comments;
  }

  public AVLTree<Integer, Comment> helpfulTree() {
    return helpfulTree;
  }

  public AVLTree<String, Comment> enrolTree() {
    return enrolTree;
  }

  public AVLTree<String, Comment> postedTree() {
    return postedTree;
  }

  public InvertedIndex<String, Comment> textIndex() {
    return textIndex;
  }
}
