package uk.reading.ac.uk.spink;

import uk.reading.ac.uk.spink.database.*;

public class Main {
    public static void main(String[] args){
        Database db1 = new Database("Employees", "postgres", "1Etsbqyuw");

        db1.Connect();
        //db1.Create(schema);
        Employee e1 = new Employee("Steve","Steve.jobs@outlook.com" ,"His house", 45, 7);
        db1.InsertOne("EmployeeTable", e1);
        db1.InsertOne("EmployeeTable", (new Employee("jim","jim.bob@outlook.com" ,"His house", 45, 7)));
        db1.Close();
    }
}