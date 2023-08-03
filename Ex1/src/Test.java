import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QLCB qlcb = new QLCB();
        while (true) {
            System.out.println("1: Insert Officer");
            System.out.println("2: Search Officer by Name");
            System.out.println("3: Show list of Officer");
            System.out.println("4: Exit");
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n==1) {
                System.out.println("1: Insert Worker");
                System.out.println("2: Insert Engineer");
                System.out.println("3: Insert Staff");
                int m = scanner.nextInt();
                scanner.nextLine();
                if (m == 1) {
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Age");
                    Integer age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Gender");
                    String gender = scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    System.out.println("Level");
                    Integer level = scanner.nextInt();
                    scanner.nextLine();
                    CanBo a = new CongNhan(name,age,gender,address,level);
                    qlcb.add(a);
                    System.out.println(a.toString());
                }
                else if (m == 2) {
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Age");
                    Integer age = scanner.nextInt();
                    System.out.println("Gender");
                    scanner.nextLine();
                    String gender = scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    System.out.println("Major");
                    String major = scanner.nextLine();

                    CanBo a = new KySu(name,age,gender,address,major);
                    qlcb.add(a);
                    System.out.println(a.toString());
                }
                else if (m == 3) {
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Age");
                    Integer age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Gender");
                    String gender = scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    System.out.println("Work");
                    String work = scanner.nextLine();

                    CanBo a = new NhanVien(name,age,gender,address,work);
                    qlcb.add(a);
                    System.out.println(a.toString());
                }
                else {
                    System.out.println("Only press 1, 2, or 3");
                }
            }
            else if (n == 2) {
                System.out.println("Name");
                String name = scanner.nextLine();
                System.out.println(name);
                qlcb.findByName(name).forEach(s -> System.out.println(s.toString()));
            }
            else if (n == 3) {
                qlcb.showList();
            }
            else if (n == 4) {
                return;
            }
            else {
                System.out.println("Please press from 1 to 4");
            }
        }
    }
}
