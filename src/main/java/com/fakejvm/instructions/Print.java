package com.fakejvm.instructions;

import com.fakejvm.Frame;
import com.fakejvm.Instruction;

public class Print implements Instruction {

    @Override
    public void execute(Frame frame) {
        int value = frame.getOperandStack().pop();
        System.out.println("PRINT ->" + value);
    }
}
