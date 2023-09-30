package com.example.couseplusplus.model.query.tokenizer.state;

import com.example.couseplusplus.model.query.Query;
import com.example.couseplusplus.model.query.Token;
import com.example.couseplusplus.model.query.TokenType;

public class SemesterState implements State {
  @Override
  public ProcessResult process(Query query, int index) {
    if (!query.isS(index) || !(query.is(index + 1, '1') || query.is(index + 1, '2')))
      throw new IllegalStateException();
    int yearStartIndex = index - 4;
    int nextIndex = index + 2;
    Token token = new Token(TokenType.EnrolDate, query.getSubstring(yearStartIndex, nextIndex));
    return new ProcessResult(nextIndex, token);
  }
}
