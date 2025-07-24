import java.io.*;

public class ListEmployees {
    public void run() {
        File dir = new File("employees");
        String[] files = dir.list();
        if (files == null || files.length == 0) System.out.println("No records.");
        else for (String name : files) System.out.println(name);
    }
}
