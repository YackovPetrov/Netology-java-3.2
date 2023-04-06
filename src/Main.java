public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight_kg = 98;
        double height_m = 1.87;
        double bmiindex = service.calculate(weight_kg, height_m);
        System.out.println("Индекс массы тела: " + bmiindex);
    }
}