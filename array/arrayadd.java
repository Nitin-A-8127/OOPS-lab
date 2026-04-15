public class arrayadd {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int sum = 0;

        for (int n : arr) {
            sum += n;
        }

        System.out.println("Sum = " + sum);
    }
}