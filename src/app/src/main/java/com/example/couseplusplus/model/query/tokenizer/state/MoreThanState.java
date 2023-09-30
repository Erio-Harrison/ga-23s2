package com.example.couseplusplus.model.query.tokenizer.state;

import com.example.couseplusplus.model.query.Query;
import com.example.couseplusplus.model.query.Token;
import com.example.couseplusplus.model.query.TokenType;

public class MoreThanState implements State {
  @Override
  public ProcessResult process(Query query, int index) {
    if (!query.is(index, '>')) throw new IllegalStateException();
    if (!query.is(index + 1, '='))
      return new ProcessResult(index + 1, new Token(TokenType.MoreThan, null));
    return new ProcessResult(index + 2, new Token(TokenType.EqualOrMoreThan, null));
  }
}
