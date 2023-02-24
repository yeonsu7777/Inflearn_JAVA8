package me.whiteship.java8to11;

public class Foo {
    public static void main(String[] args) {
        // 익명 내부 클래스 Anonymous Inner Class
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        // 위를 아래처럼 람다식으로 바꿀 수 있게 된다!
//        RunSomething runSomething = () -> System.out.println("Hello");
//        runSomething.doIt();
    }
}
