package com.compiler;

import com.compiler.util.Read;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = Read.file("codeFile.txt");
        System.out.println("fim");
    }
}