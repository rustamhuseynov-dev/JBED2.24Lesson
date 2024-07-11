package az.atlacademy.lesson25.wildcard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal cat = new Cat("Mesi",1);
        cat.eat();
        Animal dog = new Dog("Chucky",5);
        dog.eat();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Pisi",2));
        cats.add(new Cat("Mestan",3));
        upperBoundedWildcard(cats);

        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("qarabaş",2));
        lowerBoundedWildcard(dogs);

        ArrayList<Object> list = new ArrayList<>();
        list.add("S");
        list.add('c');
        list.add(4);
        list.add(4.5);
        list.add(true);
        unBoundedWildcard(list);

    }

    private static void unBoundedWildcard(ArrayList<?>arrayList) {
        for (Object element:arrayList){
            System.out.println("Class name : " + element.getClass().getName() + " : " + "value :" + element);
        }
    }

    private static void lowerBoundedWildcard(ArrayList<? super Dog>arrayList) {
        for (Object dog: arrayList){
            System.out.println("Class name : " + dog.getClass().getName());
        }
    }

    private static void upperBoundedWildcard(List<? extends Animal> list) {
        for(Animal cat: list){
            System.out.println("Class name : " + cat.getClass().getName() + " : " +"cat name : " + cat.getName());
        }
    }
}
