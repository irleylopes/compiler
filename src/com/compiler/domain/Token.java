package com.compiler.domain;

import java.util.Objects;

public class Token {

    private String image;
    private ClassToken classToken;
    private Integer line;
    private Integer column;
    private Integer tableIndexSymbols;

    public Token(String image, ClassToken classToken, Integer line, Integer column, Integer tableIndexSymbols) {
        this.image = image;
        this.classToken = classToken;
        this.line = line;
        this.column = column;
        this.tableIndexSymbols = tableIndexSymbols;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public ClassToken getClassToken() {
        return classToken;
    }

    public void setClassToken(ClassToken classToken) {
        this.classToken = classToken;
    }

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getColumn() {
        return column;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public Integer getTableIndexSymbols() {
        return tableIndexSymbols;
    }

    public void setTableIndexSymbols(Integer tableIndexSymbols) {
        this.tableIndexSymbols = tableIndexSymbols;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Token token = (Token) o;
        return Objects.equals(image, token.image) &&
                classToken == token.classToken &&
                Objects.equals(line, token.line) &&
                Objects.equals(column, token.column) &&
                Objects.equals(tableIndexSymbols, token.tableIndexSymbols);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, classToken, line, column, tableIndexSymbols);
    }

    @Override
    public String toString() {
        return "Token{" +
                "image='" + image + '\'' +
                ", classToken=" + classToken +
                ", line=" + line +
                ", column=" + column +
                ", tableIndexSymbols=" + tableIndexSymbols +
                '}';
    }
}
