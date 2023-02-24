package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {
    void doIt();
//    추상 메서드 하나만 있기 때문에 --> 함수형 인터페이스

//    void doItAgain();
//    추상 메서드 2개가 있기 때문에 --> 함수형 인터페이스 아님

    static void printName(){
        System.out.println("Rosie");
    }

    default void printAge(){
        System.out.println("25");
    }
//  다른 형태의 메소드는 중요하지 않음 추상 메소드의 개수가 1개여야함
}