import java.util.Scanner;

public class Do_while {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals("amrita123")) {
                System.out.println("Wrong password! Try again.");
            }

        } while (!password.equals("amrita123"));

        System.out.println("Login Successful! Welcome ");

        sc.close();
    }
}