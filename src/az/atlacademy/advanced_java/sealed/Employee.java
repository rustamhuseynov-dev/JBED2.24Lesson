package az.atlacademy.advanced_java.sealed;

public final class Employee extends SealedClass {

    private Long experience;

    public Employee(Long experience,String name, int age) {
        super(name, age);
        this.experience = experience;
    }

    public Long getExperience() {
        return experience;
    }
    public void setExperience(Long experience){
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "experience=" + experience +
                '}';
    }
}
