public class Main {
    public static void main(String[] args) {
        // Initialize with Add strategy
        Calculator calculator = new Calculator(new AddStrategy());
        System.out.println("10 + 5 = " + calculator.calculate(10, 5));

        // Switch strategy at runtime to Subtract
        calculator.setStrategy(new SubtractStrategy());
        System.out.println("10 - 5 = " + calculator.calculate(10, 5));

        // Switch strategy at runtime to Multiply
        calculator.setStrategy(new MultiplyStrategy());
        System.out.println("10 * 5 = " + calculator.calculate(10, 5));
    }
}