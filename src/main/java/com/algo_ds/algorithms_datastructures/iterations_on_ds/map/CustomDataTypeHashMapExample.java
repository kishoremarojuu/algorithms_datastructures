package com.algo_ds.algorithms_datastructures.iterations_on_ds.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class CustomDataTypeHashMapExample {

    public static void main(String[] args) {

        //hashMap iterations using custom dataType
        HashMap<String, List<Employee>> hashMapEmployee  = new HashMap<String, List<Employee>>();

        List<Employee> list1 = new ArrayList<>();
        Employee employee = new Employee(); employee.setFirstName("Kishore"); employee.setLastName("maroju");
        Employee employee2 = new Employee();employee2.setFirstName("ravi");employee2.setLastName("Banglore");
        list1.add(employee);list1.add(employee2);

        List<Employee> list2 = new ArrayList<>();
        Employee employee3 = new Employee();employee3.setFirstName("vasavi");employee3.setLastName("karumanchi");
        Employee employee4 = new Employee();employee4.setFirstName("digvijay");employee4.setLastName("singh");

        list2.add(employee3);list2.add(employee4);

        hashMapEmployee.put("teamEagleYe", list1);
        hashMapEmployee.put("alphaTeam", list2);

        //using entry set iteration
        for (Map.Entry<String, List<Employee>> entry : hashMapEmployee.entrySet()) {
            String key = entry.getKey();
            List<Employee> values = entry.getValue();
           // System.out.println("Team Name:"+ key);
            for (int i = 0; i<values.size(); i++) {
              //  System.out.println("Employee First Name:" + values.get(i).getFirstName());
              //  System.out.println("Employee Last  Name:" + values.get(i).getLastName());
              //  System.out.println();
            }

        }

        //using streams API with annonymouse inner class
        hashMapEmployee.entrySet().stream()
                .forEach(new Consumer<Map.Entry<String, List<Employee>>>() {
                    @Override
                    public void accept(Map.Entry<String, List<Employee>> stringListEntry) {
                       // System.out.println("printing team name:"+stringListEntry.getKey());
                        stringListEntry.getValue().stream()
                        .forEach(new Consumer<Employee>() {
                            @Override
                            public void accept(Employee employee) {
                              //  System.out.println("printing employee first name:"+employee.getFirstName());
                               // System.out.println("printing employee last name:"+employee.getLastName());
                            }
                        });
                    }
                });


        //using streams API with lambda
        hashMapEmployee.entrySet().stream()
                .forEach(stringListEntry -> {
                    System.out.println("printing team name:"+stringListEntry.getKey());
                    stringListEntry.getValue().stream()
                            .forEach(employee1 -> {
                                System.out.println("printing employee first name:"+ employee1.getFirstName());
                                System.out.println("printing employee last name:"+ employee1.getLastName());
                            });
                });


    }

   static class Employee {
        private String FirstName;
        private String LastName;

        public String getFirstName() {
            return FirstName;
        }

        public void setFirstName(String firstName) {
            FirstName = firstName;
        }

        public String getLastName() {
            return LastName;
        }

        public void setLastName(String lastName) {
            LastName = lastName;
        }

        public Employee(String firstName, String lastName) {
            FirstName = firstName;
            LastName = lastName;
        }

        public Employee(){

        }
        @Override
        public String toString() {
            return "Employee{" +
                    "FirstName='" + FirstName + '\'' +
                    ", LastName='" + LastName + '\'' +
                    '}';
        }
    }

}
