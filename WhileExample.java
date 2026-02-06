public class WhileExample {
    public static void main(String[] args) {

        int i = 1;
        boolean running = true;

        while (running) {

            // Skip number 5
            if (i == 5) {
                i++;
                continue;
            }

            
            if (i == 8) {
                running = false; 
                break;
            }

            System.out.println(i);
            i++;
        }
    }
}
