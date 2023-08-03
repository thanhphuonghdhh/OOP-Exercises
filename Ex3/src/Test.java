import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("1: Insert Candidate");
            System.out.println("2: Show information of Candidate");
            System.out.println("3: Search by ID");
            System.out.println("4: Exit");
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n==1) {
                System.out.println("1: Insert Candidate A");
                System.out.println("2: Insert Candidate B");
                System.out.println("3: Insert Candidate C");
                int m = scanner.nextInt();
                scanner.nextLine();
                if (m == 1) {
                    System.out.println("ID");
                    String id = scanner.nextLine();
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    System.out.println("Priority");
                    Integer priority = scanner.nextInt();
                    scanner.nextLine();

                    Candidate a = new CandidateA(id,name,address,priority);
                    tuyenSinh.add(a);
                    System.out.println(a.toString());
                }
                else if (m == 2) {
                    System.out.println("ID");
                    String id = scanner.nextLine();
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    System.out.println("Priority");
                    Integer priority = scanner.nextInt();
                    scanner.nextLine();

                    Candidate a = new CandidateB(id,name,address,priority);
                    tuyenSinh.add(a);
                    System.out.println(a.toString());
                }
                else if (m == 3) {
                    System.out.println("ID");
                    String id = scanner.nextLine();
                    System.out.println("Name");
                    String name = scanner.nextLine();
                    System.out.println("Address");
                    String address = scanner.nextLine();
                    System.out.println("Priority");
                    Integer priority = scanner.nextInt();
                    scanner.nextLine();

                    Candidate a = new CandidateC(id,name,address,priority);
                    tuyenSinh.add(a);
                    System.out.println(a.toString());
                }
                else {
                    System.out.println("Only press 1, 2, or 3");
                }
            }
            else if (n == 2) {
                tuyenSinh.showInfo();
            }
            else if (n == 3) {
                System.out.println("Search by ID");
                String s = scanner.nextLine();
                System.out.println(tuyenSinh.search(s).toString());
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
