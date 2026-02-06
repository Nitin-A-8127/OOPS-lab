import java.util.Scanner;

public class ForLoopMarks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter mark for subject " + i + ": ");
            int mark = sc.nextInt();
            total = total + mark;
        }

        double average = total / 5.0;

        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
    }
}
