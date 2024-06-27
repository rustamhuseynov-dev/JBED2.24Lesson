package az.atlacademy.lesson15;

import java.util.Scanner;

public class StringTask {
    public static void main(String[] args) {
        //taskOneString();
        //taskTooString();
        //taskThreeString();
        //taskFourString();

    }

    private static void taskFourString() {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] part = data.split("");

    }

    private static void taskThreeString() {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        String[] part = data.split(" ");
        String init = part[0].substring(0,1).toUpperCase() + "." + part[1].substring(0,1).toUpperCase();
        System.out.println(init);
        sc.close();
    }

    private static void taskTooString() {
        Scanner sc = new Scanner(System.in);
        String data = sc.nextLine();
        StringBuilder sb = new StringBuilder(data);
        String s = sb.reverse().toString();
        System.out.println(s);
        sc.close();
    }

    private static void taskOneString() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nidali sozu daxil et : ");
        String data = sc.nextLine();
        String rs = data.replace("!","");
        System.out.println(rs);
        sc.close();
    }
}
