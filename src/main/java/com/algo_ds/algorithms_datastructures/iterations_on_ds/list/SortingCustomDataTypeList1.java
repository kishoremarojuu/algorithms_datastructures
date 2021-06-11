package com.algo_ds.algorithms_datastructures.iterations_on_ds.list;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingCustomDataTypeList1 {
    public static void main(String[] args) {

        List<Patient> arrlist = new ArrayList<>();
        Patient patient1 = new Patient();
        patient1.setAge(30);patient1.setName("john");

        Patient patient2= new Patient();
        patient2.setAge(19);patient2.setName("doe");

        arrlist.add(patient1); arrlist.add(patient2);

        //looping using java8 streams
        arrlist.stream()
                .sorted(Comparator.comparingInt(Patient::getAge))
                .forEach(System.out::println);

        

    }
    public static class Patient {
        private int age;
        private String name;

        public Patient() {
        }

        public Patient(int age, String name) {
            this.age = age;
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Patient{" +
                    "age=" + age +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


}


