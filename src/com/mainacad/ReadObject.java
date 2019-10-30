package com.mainacad;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.logging.Logger;

public class ReadObject {
    private static final Logger LOGGER = Logger.getLogger(Person.class.getName());
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("Human.obj");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject();
            Person person2 = (Person) objectInputStream.readObject();

            LOGGER.info(String.valueOf(person1));
            LOGGER.info(String.valueOf(person2));

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
