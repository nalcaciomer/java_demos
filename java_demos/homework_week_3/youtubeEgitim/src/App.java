public class App {
    public static void main(String[] args) throws Exception {
        // Value and Reference Types

        // Value Type
        int number1 = 10;
        int number2 = 20;
        number1 = number2;
        number2 = 100;

        System.out.println(number1);

        // Reference Type
        int[] numbers1 = new int[] { 1, 2, 3 };
        int[] numbers2 = new int[] { 10, 20, 30 };

        numbers1 = numbers2;
        numbers2[0] = 1000;

        System.out.println(numbers1[0]);
    }
}
