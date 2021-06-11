package com.algo_ds.algorithms_datastructures.stack_queue;

import java.util.Arrays;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Queue_102_AnimalShelter {

    public static void main(String[] args) throws Exception {
        // TODO Auto-generated method stub
        AnimalShelter as = new AnimalShelter();
        List<Animal> animalList = Arrays.asList(
                new Dog(), new Dog(), new Dog(), new Dog(),
                new Cat(), new Cat(), new Cat(), new Cat()
        );
        for (Animal animal : animalList)
            as.enqueue(animal);
        as.dequeueAny();
        as.dequeueCat();
        as.dequeueDog();
        System.out.println(as.cats.size());
        System.out.println(as.dogs.size());
    }
}

class Animal {
    String type;
    Date dateArrived;
}

class Dog extends Animal {
    Dog() {
        super();
        type = "dog";
    }
}

class Cat extends Animal {
    Cat() {
        super();
        type = "cat";
    }
}

class AnimalShelter {
    Queue<Dog> dogs;
    Queue<Cat> cats;

    public AnimalShelter() {
        // TODO Auto-generated constructor stub
        dogs = new LinkedList<Dog>();
        cats = new LinkedList<Cat>();
    }

    public void enqueue(Animal animal) throws Exception {
        boolean isCat = animal.type.equals("cat");
        boolean isDog = animal.type.equals("dog");
        if ((!isCat) && (!isDog))
            throw new Exception("Unknow type of animal!");
        animal.dateArrived = new Date();
        if (isCat) {
            if (animal instanceof Cat) {
                cats.offer((Cat) animal);
            }
            if (isDog) {
                if (animal instanceof Dog)
                    dogs.offer((Dog) animal);
            }

        }
    }
        public Animal dequeueAny () throws Exception {
            boolean noCat = cats.isEmpty();
            boolean noDog = dogs.isEmpty();
            if (noCat && noDog)
                throw new Exception("There are no more animals!");
            if (noCat)
                return dogs.poll();
            else if (noDog)
                return cats.poll();
            else
                return cats.peek().dateArrived.compareTo(dogs.peek().dateArrived) < 0 ? cats.poll() : dogs.poll();
        }

        public Cat dequeueCat () throws Exception {
            boolean noCat = cats.isEmpty();
            if (noCat)
                throw new Exception("There are no more cats!");
            return cats.poll();
        }

        public Dog dequeueDog () throws Exception {
            boolean noDog = dogs.isEmpty();
            if (noDog)
                throw new Exception("There are no more dogs!");
            return dogs.poll();
        }
    }
