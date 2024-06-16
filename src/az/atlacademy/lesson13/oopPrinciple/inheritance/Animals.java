package az.atlacademy.lesson13.oopPrinciple.inheritance;

public class Animals {
    private String nickname;

    private int age;

    public Animals(String nickname, int age) {
        this.nickname = nickname;
        this.age = age;
    }
    public Animals(){

    }

    public void eat(){
        System.out.println(nickname + " is eating");
    }

    public void sleep(){
        System.out.println(nickname + " is sleeping");
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
