import java.io.*;
import java.util.*;

public class ReadEmployee {
    public void run(Scanner sc) {
        System.out.print("ID: ");
        String id = sc.nextLine();
        try {
            BufferedReader br = new BufferedReader(new FileReader("employees/" + id + ".txt"));
            String text;
            while ((text = br.readLine()) != null)
                System.out.println(text);
            br.close();
        } catch (Exception e) {
            System.out.println("Not found.");
        }
    }
}

