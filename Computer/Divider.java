package Computer;

public class Divider extends Computer {
    @Override
    public double compute(double A, double B) {
        if (B == 0) {
            throw new ArithmeticException("Cannot divide by zero.");
        }
        return A / B;
    }
}


