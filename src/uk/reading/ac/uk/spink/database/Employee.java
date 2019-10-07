package uk.reading.ac.uk.spink.database;

import javax.xml.parsers.SAXParser;

public class Employee {
    String name;
    String address;
    int age;
    int salary;

    public Employee(String name, String address, int age,int salary){
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }
}
