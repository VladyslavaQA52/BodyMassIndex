public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightMeters = 1.75;
        int weightKilos = 70;
        int Bmi = (int) service.calculate(weightKilos, heightMeters);
        System.out.println(Bmi);
    }
}