package az.atlacademy.advanced_java.sealed;

public sealed class SealedClass permits Person,Employee{

    private String name;
    private int age;

    public SealedClass(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "SealedClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
