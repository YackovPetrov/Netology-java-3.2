public class BmiService {
    public double calculate (double weight_kg, double height_m){
        double index = weight_kg / (height_m * 2);
        int result = (int)index;
        return result;

    }
}
