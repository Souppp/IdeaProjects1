package com.company;

public class Main {

    public static void main(String[] args) {
        Person maks = new Person(180, 75.4f);
        Person.write("This is function 'write'" );
        maks.say("Hello I'm Maks");
        System.out.println(maks.height);

        Person oleg = new Person();
        oleg.height = 180;
        oleg.weight = 75.4f;

        System.out.println(oleg.height);

        Student vova = new Student(175, 80, 3);
        System.out.println(vova.cource);
    }

}
