import java.io.*;
import java.util.*;

public class DeleteEmployee {
    public void run(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        File f = new File("employees/" + id + ".txt");
        if (f.delete()) System.out.println("Deleted.");
        else System.out.println("Not found.");
    }
}
