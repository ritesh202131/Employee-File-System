import java.util.*;

public class EmployeeFileManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        new java.io.File("employees").mkdir();

        while (true) {
            System.out.println("1. Create\n2. Read\n3. Update\n4. Delete\n5. List\n6. Exit");
            int ch = sc.nextInt();
            sc.nextLine();

            if (ch == 1) new CreateEmployee().run(sc);
            else if (ch == 2) new ReadEmployee().run(sc);
            else if (ch == 3) new UpdateEmploy1ee().run(sc);
            else if (ch == 4) new DeleteEmployee().run(sc);
            else if (ch == 5) new ListEmployees().run();
            else if (ch == 6) break;
        }
    }
}
