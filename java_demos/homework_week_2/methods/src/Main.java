public class Main {
    public static void main(String[] args) {
        findNumber(6);
    }

    public static void findNumber(int willFind) {
        int[] numbers = new int[] { 1, 2, 5, 7, 9, 0 };
        boolean isExists = false;

        for (int number : numbers) {
            if (number == willFind) {
                isExists = true;
                break;
            }
        }

        if (isExists) {
            giveMessage(willFind + " mevcuttur ");
        } else {
            giveMessage(willFind + " mevcut değildir");
        }
    }

    public static void giveMessage(String message) {
        System.out.println(message);
    }

}
