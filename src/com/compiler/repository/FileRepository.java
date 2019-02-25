package com.compiler.repository;

import java.util.Collections;
import java.util.List;

public class FileRepository {

    private List<String> listOfFileLines;

    public FileRepository(List<String> listOfFileLines) {
        this.listOfFileLines = listOfFileLines;
    }

    public void add(String line) {
        if (line != null) {
            this.listOfFileLines.add(line);
        }
    }

    public String findByIndex(Integer index) {
        return this.listOfFileLines.get(index);
    }

    public List<String> findAll() {
        return this.listOfFileLines;
    }
}