# fakeJVM
가짜 JVM 만들어보고 JVM의 동작원리 이해하기

## 디렉토리 구조
```
FakeJVM/
├── build.gradle   
├── settings.gradle           
├── README.md                 
└── src/
    ├── main/
    │   └── java/
    │       └── com/
    │           └── fakejvm/
    │               ├── FakeJVM.java              # 메인 실행기
    │               ├── Frame.java                # Frame 구조
    │               ├── OperandStack.java         # 스택 자료구조
    │               ├── Instruction.java          # 명령어 인터페이스
    │               └── instructions/
    │                   ├── Push.java             # PUSH 명령어 구현
    │                   ├── Add.java              # ADD 명령어 구현
    │                   └── Print.java            # PRINT 명령어 구현
    └── test/
```

## 테스트용 txt 파일
```
PUSH 10
PUSH 20
ADD
PRINT
```