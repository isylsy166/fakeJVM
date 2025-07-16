# fakeJVM
가짜 JVM 만들어보고 JVM의 동작원리 이해하기

## 디렉토리 구조
```
FakeJVM/
├── src/
│   └── jvm/
│       ├── FakeJVM.java           # 메인 실행기
│       ├── Frame.java             # 하나의 실행 단위
│       ├── OperandStack.java      # 스택 자료구조
│       ├── Instruction.java       # 명령어 인터페이스
│       └── instructions/
│           ├── Push.java
│           ├── Add.java
│           └── Print.java
├── instructions.txt               # 명령어 입력
└── README.md
```
