package com.mycompany.xo.game;


public class Players  {
       private String name;
    private char op;

    public Players() {
    }

    public Players(String name, char op) {
        this.name = name;
        this.op = op;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOp(char op) {
        this.op = op;
    }

    public String getName() {
        return name;
    }

    public char getOp() {
        return op;
    }
    
}
