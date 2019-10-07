package uk.reading.ac.uk.spink.database;

import org.jetbrains.annotations.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

//Create database class
public class Database {

    private static String EmployeeTable;
    private String databaseName;
    private String userName;
    private String password;
    private Connection c =null;

    //Create class constructor
    public Database(String databaseName, String userName, String password) {
        this.databaseName = databaseName;
        this.userName = userName;
        this.password = password;
    }

    //Connect to database
    void Connect(){
        try {
            Class.forName("org.postgresql.Driver");
            this.c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/"+this.databaseName,
                            this.userName, this.password);
            System.out.println("Opened database successfully");
    } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void Close(){
        try {
            this.c.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void Create(String sql){
        try {
            Statement stmt = this.c.createStatement();
            stmt.executeUpdate(sql);
            System.out.println("Created Table COMPANY2");
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void InsertOne(String Table, @NotNull Employee e){
        try {
          Statement stm;
          stm = this.c.createStatement();
          String sql = "INSERT INTO public.\""+Table+"\"(\"Name\", \"Email\", \"Address\", \"Age\", \"Salary\")\n" +
                  "VALUES ('"+e.name+"','"+e.email+"','"+e.address+"',"+e.age+","+e.salary+");";
          System.out.println(sql);
          stm.executeUpdate(sql);
          System.out.println("Inserted "+e.toString());
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Database db1 = new Database("Employees", "postgres", "1Etsbqyuw");
        db1.Connect();
        //db1.Create(schema);
        Employee e1 = new Employee("Bob","bob.Jim@outlook.com" ,"His house", 45, 6);
        db1.InsertOne("EmployeeTable", e1);
    }

}

