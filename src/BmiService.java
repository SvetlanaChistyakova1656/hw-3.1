public class BmiService {
    public int calculate(double weight, double height) {
        double bmiIndex = weight / (height * height);
        int roundedIndex = (int) bmiIndex;
        return roundedIndex;
    }
}
