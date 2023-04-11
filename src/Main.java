public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 98;
        double heightM = 1.87;
        double bmiIndex = service.calculate(weightKg, heightM);
        System.out.println("Индекс массы тела: " + bmiIndex);
    }
}