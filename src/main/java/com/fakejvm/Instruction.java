package com.fakejvm;

/**
 * 모든 명령어들이 따르는 인터페이스
 **/
public interface Instruction {
    void execute(Frame frame);
}
