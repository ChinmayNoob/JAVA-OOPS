import java.util.ArrayList;
import java.util.Date;

// Assuming Loan and Circle classes are defined with a toString() method
public class prac6A {
    public static void main(String[] args) {
        // Create an ArrayList to hold objects of different types
        ArrayList<Object> list = new ArrayList<>();

        // Create and add a Loan object
        Loan loan = new Loan(1000, 5.5, 12); // Assuming Loan has a constructor
        list.add(loan);

        // Create and add a Date object
        Date date = new Date();
        list.add(date);

        // Add a String
        list.add("This is a string.");

        // Create and add a Circle object
        Circle circle = new Circle(5); // Assuming Circle has a constructor
        list.add(circle);

        // Iterate over the ArrayList and print each object's string representation
        for (Object obj : list) {
            System.out.println(obj.toString());
        }
    }
}

// Example Loan class with a toString() method
class Loan {
    private double amount;
    private double interestRate;
    private int term;

    public Loan(double amount, double interestRate, int term) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "amount=" + amount +
                ", interestRate=" + interestRate +
                ", term=" + term +
                '}';
    }
}

// Example Circle class with a toString() method
class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

