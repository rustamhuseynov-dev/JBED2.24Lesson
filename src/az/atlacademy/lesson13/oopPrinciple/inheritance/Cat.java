package az.atlacademy.lesson13.oopPrinciple.inheritance;

public class Cat extends Animals{
    public Cat(String nickname, int age) {
        super(nickname, age);
    }

    public Cat(){

    }

    public void meow(){
        System.out.println(getNickname() + " is meowing");
    }
}
