package uk.reading.ac.uk.spink.database;

import javax.xml.parsers.SAXParser;

public class Employee {
    String name;
    String email;
    String address;
    int age;
    int salary;

    public String toString(){
        String s = "Name: " + this.name + "\n" +
                "Email: " + this.email + "\n" +
                "Address: " + this.address + "\n" +
                "Age: " + this.age + "\n" +
                "Salary: " + this.salary;
        return s;
    }

    public Employee(String name,String email , String address, int age,int salary){
        this.name = name;
        this.email = email;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
}
