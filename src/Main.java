public class Main {
    public static void main(String[] args) {
        BmiService service= new BmiService();
        int weight = 80;
        double height = 1_8;
        double index= service.calculate(weight,height);
        System.out.println(index);
    }
}
