package com.example.couseplusplus.model.query.tokenizer.state;

import com.example.couseplusplus.model.query.Query;
import com.example.couseplusplus.model.query.Token;
import com.example.couseplusplus.model.query.TokenType;

public class PostedState implements State {
  @Override
  public ProcessResult process(Query query, int index) {
    if (!query.is(index, 'p')
        || !query.is(index + 1, 'o')
        || !query.is(index + 2, 's')
        || !query.is(index + 3, 't')
        || !query.is(index + 4, 'e')
        || !query.is(index + 5, 'd')) throw new IllegalStateException();

    int nextIndex = index + 6;
    return new ProcessResult(nextIndex, new Token(TokenType.Posted, null));
  }
}
