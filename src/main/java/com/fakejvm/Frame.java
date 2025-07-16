package com.fakejvm;

/**
 * 메서드 실행 단위, 스택/변수 등을 담는 컨테이너
 **/
public class Frame {
    private final OperandStack opStack = new OperandStack();

    public OperandStack getOperandStack() {
        return opStack;
    }
}
