package com.compiler.repository;

import com.compiler.domain.Token;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TokenRepository {

    private List<Token> tokens = new ArrayList<>();

    public void add(Token token) {
        this.tokens.add(token);
    }

    public Token findByIndex(Integer index) {
        return this.tokens.get(index);
    }

    public List<Token> findAll() {
        return Collections.unmodifiableList(this.tokens);
    }
}
