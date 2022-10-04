public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel.";
        String newMessage = message.substring(0, 2);
        System.out.println(newMessage);

        System.out.println(addNumbers(5, 7));

        System.out.println(addNumbers(2, 3, 4, 5, 6, 10));
    }

    public static void add() {
        System.out.println("Eklendi!");
    }

    public static void delete() {
        System.out.println("Silindi!");
    }

    public static void update() {
        System.out.println("Güncellendi!");
    }

    public static int addNumbers(int number1, int number2) {
        return number1 + number2;
    }

    // Variable arguments
    public static int addNumbers(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }

        return total;
    }
}
