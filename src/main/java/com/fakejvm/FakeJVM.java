package com.fakejvm;

import com.fakejvm.instructions.Add;
import com.fakejvm.instructions.Print;
import com.fakejvm.instructions.Push;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FakeJVM {
    public static void main(String[] args) throws IOException {

        Frame frame = new Frame();
        List<Instruction> program = loadInstructions("instructions.txt");

        System.out.println("[FakeJVM 시작]");
        for (Instruction instruction : program) {
            instruction.execute(frame);
        }
        System.out.println("[FakeJVM 종료]");
    }

    private static List<Instruction> loadInstructions(String fileName) throws IOException {

        List<Instruction> instructions = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));

        String line;

        while ((line = reader.readLine()) != null) {
            String[] parts = line.trim().split(" ");
            switch (parts[0]) {
                case "PUSH" -> instructions.add(new Push(Integer.parseInt(parts[1])));
                case "ADD" -> instructions.add(new Add());
                case "PRINT" -> instructions.add(new Print());
                default -> throw new RuntimeException("알 수 없는 명령어: " + parts[0]);
            }
        }
        return instructions;
    }

}
