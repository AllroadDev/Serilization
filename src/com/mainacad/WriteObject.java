package com.mainacad;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        Person person1 = new Person(00000001, "Alex");
        Person person2 = new Person(00000002, "Victor");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Human.obj");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person1);
            objectOutputStream.writeObject(person2);

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
