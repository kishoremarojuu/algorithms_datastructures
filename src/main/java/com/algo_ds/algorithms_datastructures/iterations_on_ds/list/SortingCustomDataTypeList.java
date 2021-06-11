package com.algo_ds.algorithms_datastructures.iterations_on_ds.list;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingCustomDataTypeList {
    public static void main(String[] args) {

        List<Patient> arrlist = Arrays.asList(
               new Patient(29,"john"),
               new Patient(35,"doe"),
               new Patient(19,"michal")
                );


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


