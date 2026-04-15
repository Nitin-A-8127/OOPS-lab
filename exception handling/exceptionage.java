class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class ElectionBooth {
    public void validateVoter(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Access Denied: Age must be 18 or older.");
        } else {
            System.out.println("Access Granted: Please cast your vote.");
        }
    }
}

public class exceptionage {
    public static void main(String[] args) {
        ElectionBooth booth = new ElectionBooth();
        try {
            booth.validateVoter(16);
        } catch (InvalidAgeException e) {
            System.out.println("Caught an error: " + e.getMessage());
        }
    }
}