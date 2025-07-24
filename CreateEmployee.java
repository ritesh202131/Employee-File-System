import java.io.*;
import java.util.*;

public class CreateEmployee {
    public void run(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Dept: ");
        String dept = sc.nextLine();
        System.out.print("Salary: ");
        String sal = sc.nextLine();

        try {
            FileWriter fw = new FileWriter("employees/" + id + ".txt");
            fw.write(id + "\n" + name + "\n" + dept + "\n" + sal);
            fw.close();
            System.out.println("Created.");
        } catch (Exception e) {
            System.out.println("Error and the error is: " + e.getMessage());

        }
    }
}
