package com.example.couseplusplus.model.query.tokenizer.state;

import com.example.couseplusplus.model.query.Query;
import com.example.couseplusplus.model.query.tokenizer.ProcessResult;
import com.example.couseplusplus.model.query.tokenizer.Token;
import com.example.couseplusplus.model.query.tokenizer.TokenType;

/**
 * @author Yuki Misumi (u7582380)
 */
public class LessThanState implements State {
  @Override
  public ProcessResult process(Query query, int index) {
    if (!query.is(index, '<')) throw new IllegalTokenException();
    if (!query.is(index + 1, '='))
      return new ProcessResult(index + 1, new Token(TokenType.LessThan, null));
    return new ProcessResult(index + 2, new Token(TokenType.EqualOrLessThan, null));
  }
}
