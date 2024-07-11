package az.atlacademy.lesson25.autoboxing;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Integer num = 5;
        int primNum = 10;

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(primNum);//auto boxing hadisəsi burda baş verir mənnən integer istdiyi halda int verirəm
        System.out.println(arrayList);
        //

        int result = num + primNum; //auto - unBoxing hadisəsi burda baş verir İnteger dəyər primitive dəyər ilə toplanır
        System.out.println(result);
    }
}
