public class BmiService {
    public double calculate(double weightKg, double heightM) {
        double index = weightKg / (heightM * heightM);
        int result = (int) index;
        return result;

    }
}
