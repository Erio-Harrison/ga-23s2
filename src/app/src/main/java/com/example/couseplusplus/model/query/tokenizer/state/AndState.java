package com.example.couseplusplus.model.query.tokenizer.state;

import com.example.couseplusplus.model.query.Query;
import com.example.couseplusplus.model.query.Token;
import com.example.couseplusplus.model.query.TokenType;

public class AndState implements State {
  @Override
  public ProcessResult process(Query query, int index) {
    if (!query.is(index, '&')) throw new IllegalStateException();
    return new ProcessResult(index + 1, new Token(TokenType.And, null));
  }
}
