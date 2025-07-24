import java.io.*;
import java.util.*;

public class UpdateEmployee {
    public void run(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        File f = new File("employees/" + id + ".txt");
        if (!f.exists()) {
            System.out.println("Not found.");
            return;
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(f));
            String oldId = br.readLine();
            String name = br.readLine();
            br.close();

            System.out.print("New Dept: ");
            String dept = sc.nextLine();
            System.out.print("New Salary: ");
            String sal = sc.nextLine();

            FileWriter fw = new FileWriter(f);
            fw.write(oldId + "\n" + name + "\n" + dept + "\n" + sal);
            fw.close();
            System.out.println("Updated.");
        } catch (Exception e) {
            System.out.println("Error.");
        }
    }
}
