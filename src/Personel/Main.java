package Personel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Alumni a = new Alumni();
        System.out.println("My id : " + a.register(35, "male"));
        System.out.println("My id : " + a.register(35, "male"));
        System.out.println("My id : " + a.register(36, "male"));
        System.out.println("My id : " + a.register(35, "female"));
        System.out.println("My id : " + a.register(35, "female"));

        Merchant m = new Merchant();
        System.out.println("My id : " + m.register(35, "male"));
        System.out.println("My id : " + m.register(35, "male"));


    }
}
