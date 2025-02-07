package com.example.couseplusplus.model.query.tokenizer;

/**
 * @author Yuki Misumi (u7582380)
 */
public enum TokenType {
  // keyword
  Helpful,
  Enrol,
  Posted,
  Text,
  // comparator
  MoreThan,
  LessThan,
  EqualOrMoreThan,
  EqualOrLessThan,
  Equal,
  // like
  Like,
  // operand
  Integer,
  DateTime,
  EnrolDate,
  TextValue,
  // parenthesis
  LeftParenthesis,
  RightParenthesis,
  // condition
  And,
  Or,
  // end
  End,
  // eror
  Error,
  ;

  public boolean isComparable() {
    switch (this) {
      case MoreThan:
      case LessThan:
      case EqualOrMoreThan:
      case EqualOrLessThan:
      case Equal:
        return true;
      default:
        return false;
    }
  }
}
