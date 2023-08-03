import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Quarter quarter = new Quarter();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of families:");
        int n = scanner.nextInt();
        scanner.nextLine();
        for(int i = 1; i <= n; i++) {

            System.out.println("Enter Family "+i+" ID:");
            String address = scanner.nextLine();


            List<Person> persons = new ArrayList<>();
            System.out.println("Number of people in family " + i);
            int number = scanner.nextInt();
                scanner.nextLine();
            for (int j = 1; j <= number; j++) {
                System.out.println("Name of person "+j);
                String name = scanner.nextLine();
                System.out.println("Age of person "+j);
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Job of person "+j);
                String job = scanner.nextLine();
                System.out.println("ID of person "+j);
                String id = scanner.nextLine();
                persons.add(new Person(name,age,job,id));
            }
            Family family = new Family(address,persons);
            quarter.add(family);

        }

        quarter.families.forEach(s -> System.out.println(s.toString()));
    }
}
