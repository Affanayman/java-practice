package exception;

import exception.Animal;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();

        try {
            animal.sound();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}