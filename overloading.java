public class overloading{
    public static void ma    }   

public class Calculator {

    // Method to add two integ
    public int add(int a, int b) {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        // Calling the overloaded methods
        int sum1 = calculator.add(5, 10); // Calls the first metho
        int sum2 = calculator.add(5, 10, 15); // Calls the second metho
        double sum3 = calculator.add(5.5, 10.5); // Calls the third method

        // Displaying the results
        System.out.println("Sum of 5 and 10: " + sum1);
        System.out.println("Sum of 5, 10, and 15: " + sum2);
        System.out.println("Sum of 5.5 and 10.5: " + sum3);
    }
}