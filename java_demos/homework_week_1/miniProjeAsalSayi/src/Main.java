public class Main {
    public static void main(String[] args) {
        int number = 9;
        boolean isPrime = number >= 2 ? true : false;

        for (int i = number - 1; i >= 2; i--) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }

        }

        if (isPrime) {
            System.out.println(number + " = Asaldır");
        } else {
            System.out.println(number + " = Asal değildir.");
        }
    }
}
