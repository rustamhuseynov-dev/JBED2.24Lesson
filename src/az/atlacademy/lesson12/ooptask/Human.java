package az.atlacademy.lesson12.ooptask;

public class Human {
    private String name;

    private String surname;

    private int year;

    private int iq;

    private Pet pet;

    private Human mother;

    private Human father;

    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }

    public Human(String name, String surname, int year){
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human(String name, String surname, int year,Human mother, Human father){
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.mother = mother;
        this.father = father;
    }

    public Human(){

    }



    public void greetPet(){
        System.out.println("Hello " + getPet().getNickname());
    }

    public void describePet(){
        System.out.println("I have a " + getPet().getSpecies() + ", he is " + getPet().getAge() + ", he is " +
                (getPet().getTrickLevel() > 50 ? "very sly" : "almost not sly")
                );
    }

    public void printInfo(){
        //schedule();
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Year of Birth: " + year);
        System.out.println("IQ: " + iq);
        System.out.println("Pet: " + (pet != null ? pet.getNickname() + " the " + pet.getSpecies() : "No pet"));
        System.out.println("Mother: " + (mother != null ? mother.getName() + " " + mother.getSurname() : "Unknown"));
        System.out.println("Father: " + (father != null ? father.getName() + " " + father.getSurname() : "Unknown"));
        System.out.println("Schedule:");
        logical();
    }

    private void logical() {
        if (schedule != null) {
            String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            for (int i = 0; i < schedule.length; i++) {
                System.out.println(daysOfWeek[i] + ":");
                for (String activity : schedule[i]) {
                    System.out.println("  - " + activity);
                }
            }
        } else {
            System.out.println("No schedule");
        }
    }

    public void schedule(){
        String[][] schedule = {
                {"Reading", "Jogging"}, // Sunday
                {"Yoga", "Coding"}, // Monday
                {"Swimming", "Painting"}, // Tuesday
                {"Dancing", "Writing"}, // Wednesday
                {"Cycling", "Gardening"}, // Thursday
                {"Hiking", "Cooking"}, // Friday
                {"Tennis", "Movies"} // Saturday
        };
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String[][] getSchedule() {
        return schedule;
    }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    }
}
