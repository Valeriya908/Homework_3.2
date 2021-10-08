public class BmiService {
    public double calculate(double weight) {
        double height = 1.75;
        double bmi = (weight / Math.pow(height,2));
        return bmi;
    }
}