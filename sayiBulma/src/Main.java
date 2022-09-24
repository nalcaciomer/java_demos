public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        int willFind = 6;
        boolean isExists = false;

        for (int number : numbers) {
            if (number == willFind) {
                isExists = true;
                break;
            }
        }

        if (isExists) {
            System.out.println("Sayı mevcuttur.");
        } else {
            System.out.println("Sayı mevcut değildir.");
        }
    }
}
