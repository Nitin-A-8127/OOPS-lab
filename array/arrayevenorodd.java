class Numbers {
    int[] arr;

    Numbers(int[] arr) {
        this.arr = arr;
    }

    void count() {
        int even = 0, odd = 0;

        for (int n : arr) {
            if (n % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}

public class arrayevenorodd {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, 4, 5};

        Numbers n = new Numbers(a);

        n.count();
    }
}