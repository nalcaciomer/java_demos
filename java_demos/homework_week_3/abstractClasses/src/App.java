public class App {
    public static void main(String[] args) throws Exception {
        GameCalculator gameCalculator = new WomanGameCalculator();
        GameCalculator gameCalculator2 = new ManGameCalculator();
        GameCalculator gameCalculator3 = new KidsGameCalculator();
    }
}
