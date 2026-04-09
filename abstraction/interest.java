abstract class Bank {
    abstract double getInterestRate();

    void showMessage() {
        System.out.println("Welcome to the Bank");
    }
}

class SBI extends Bank {
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    double getInterestRate() {
        return 7.2;
    }
}

class ICICI extends Bank {
    double getInterestRate() {
        return 6.9;
    }
}

public class interest {
    public static void main(String[] args) {

        SBI s = new SBI();
        s.showMessage();
        System.out.println("SBI Interest Rate: " + s.getInterestRate() + "%");

        HDFC h = new HDFC();
        System.out.println("HDFC Interest Rate: " + h.getInterestRate() + "%");

        ICICI i = new ICICI();
        System.out.println("ICICI Interest Rate: " + i.getInterestRate() + "%");
    }
}