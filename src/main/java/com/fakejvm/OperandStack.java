package com.fakejvm;

import java.util.Stack;

/**
 * 실제 스택 연산을 처리하는 자료구조
 **/
public class OperandStack {
    private final Stack<Integer> stack = new Stack<>();

    public void push(int value) {
        stack.push(value);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("스택 언더플로우!");
        }
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }
}
