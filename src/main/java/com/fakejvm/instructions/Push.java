package com.fakejvm.instructions;

import com.fakejvm.Frame;
import com.fakejvm.Instruction;

/**
 * Push 명령어
 **/
public class Push implements Instruction {

    private final int value;

    public Push(int value) {this.value = value;}

    @Override
    public void execute(Frame frame){
        frame.getOperandStack().push(value);
        System.out.println("Pushed value " + value);
    }
}
