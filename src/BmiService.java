public class BmiService {
    public double calculate (int weight, double height){
        double index = weight / (height * height) * 100;
        return index;
    }
}
