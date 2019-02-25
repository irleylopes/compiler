package com.compiler.logic;

import com.compiler.repository.FileRepository;
import com.compiler.repository.TokenRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreatmentTokens {

    private TokenRepository tokenRepository;
    private List<String[]> listOfTokensLines = new ArrayList<>();
    private List<String> listOfFileLines;
    private List<String> listOfTokens = new ArrayList<>();

    public TreatmentTokens(FileRepository fileRepository, TokenRepository tokenRepository) {
        this.tokenRepository = tokenRepository;
        this.listOfFileLines = fileRepository.findAll();
    }

    public void separationListTokens() {
        listOfTokensLines.forEach( tokens -> {
            for(int i = 0; i < tokens.length; i++) {
                if(tokens[i].contains("\"")){
                    StringBuilder strBuilder = new StringBuilder(tokens[i]);
                    i++;
                    while(i < tokens.length) {
                        strBuilder.append(" " + tokens[i]);
                        if(tokens[i].contains("\""))
                            break;
                        i++;
                    }
                    this.listOfTokens.add(strBuilder.toString().replace("\"",""));
                }
                else {
                    this.listOfTokens.add(tokens[i]);
                }
            }
        });
    }

    public void separationTokensOfLines() {
        this.listOfFileLines.forEach(
                line -> this.listOfTokensLines.add(line.split(" ")));

    }

    public void removeUnnecessarySymbols() {
        this.listOfTokens.removeAll(Collections.singleton(""));
        for(int i = 0; i < this.listOfTokens.size(); i++) {
            if(this.listOfTokens.get(i).contains("\t")) {
                String token = this.listOfTokens.get(i);
                this.listOfTokens.set(i, token.replace("\t",""));
            }
        }
        this.listOfTokens.forEach( token -> {
            token.replace("\t","");
        });
    }

}