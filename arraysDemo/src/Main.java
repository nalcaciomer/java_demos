public class Main {
    public static void main(String[] args) {
        String student1 = "Ömer";
        String student2 = "Sinan";
        String student3 = "Engin";

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);

        System.out.println("-----------");

        String[] students = new String[3];
        students[0] = "Engin";
        students[1] = "Ömer";
        students[2] = "Sinan";

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }

        System.out.println("-----ForEach-----");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
