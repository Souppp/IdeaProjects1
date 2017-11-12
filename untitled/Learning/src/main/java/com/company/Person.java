package com.company;

public class Person {
    int height ;
    float weight;

    public static void write(String sts){
        System.out.println(sts);
    }

    void say (String str) {
        System.out.println(str);

    }
    Person(int height, float weight) {
        this.height = height;
        this.weight = weight;
    }

    Person(){}
}
