package com.tutorialspoint.visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
