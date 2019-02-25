package com.compiler;

import com.compiler.logic.TreatmentTokens;
import com.compiler.repository.FileRepository;
import com.compiler.repository.TokenRepository;
import com.compiler.util.ReadFile;

public class Main {

    public static void main(String[] args) {
        FileRepository fileRepository = new FileRepository(ReadFile.file("codeFile.txt"));
        TokenRepository tokenRepository = new TokenRepository();

        TreatmentTokens treatmentTokens = new TreatmentTokens(fileRepository, tokenRepository);

        treatmentTokens.separationTokensOfLines();
        treatmentTokens.separationListTokens();
        treatmentTokens.removeUnnecessarySymbols();

        System.out.println("fim");
    }
}