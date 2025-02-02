package az.atlacademy.constructor_chaining;

public class Constructor {

    String name;
    int age;


    public Constructor(){
        this("Rustam",12);
    }

    public Constructor(String name, int i) {
        this.name = name;
        this.age = i;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
