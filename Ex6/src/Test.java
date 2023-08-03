import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Classes classes = new Classes();

        while (true) {
            System.out.println("1: Insert new Student");
            System.out.println("2: Show list of students who is 20 years old ");
            System.out.println("3: Show list of students who is 23 years old and born in DN");

            int n = scanner.nextInt();
            scanner.nextLine();

            if (n == 1) {
                System.out.println("Name");
                String name = scanner.nextLine();
                System.out.println("Age");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Address");
                String address = scanner.nextLine();

                Student a = new Student(name,age,address);
                classes.add(a);
            }
            else if (n == 2) {
                classes.showAge20().forEach(s -> System.out.println(s.toString()));
            }
            else if (n == 3) {
                classes.showAge23DN().forEach(s -> System.out.println(s.toString()));
            }
            else {
                System.out.println("Please press from 1 to 3");
            }
        }
    }
}
