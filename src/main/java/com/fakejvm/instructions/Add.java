package com.fakejvm.instructions;

import com.fakejvm.Frame;
import com.fakejvm.Instruction;

public class Add implements Instruction {
    @Override
    public void execute(Frame frame) {
        int b = frame.getOperandStack().pop();
        int a = frame.getOperandStack().pop();
        int result = a + b;
        frame.getOperandStack().push(result);
        System.out.println("ADD → " + result);
    }
}
