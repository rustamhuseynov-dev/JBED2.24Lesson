package az.atlacademy.lesson13.oopPrinciple.inheritance;

public class Dog extends Animals{
    public Dog(String nickname, int age) {
        super(nickname, age);
    }

    public Dog(){

    }

    public void bark(){
        System.out.println(getNickname() + " is barking");
    }
}
