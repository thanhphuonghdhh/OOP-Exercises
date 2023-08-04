import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Department it = new Department();
        Result r1 = new Result(1,2);
        Result r2 = new Result(1,7);
        List<Result> l = new ArrayList<>();
        l.add(r1);
        l.add(r2);
        Student s = new RegularStudent();
        Student s1 =  new RegularStudent("1","2",LocalDate.parse("2021-01-01"),2012,8,l);
        Student s2 =  new RegularStudent("1","2",LocalDate.parse("2021-01-01"),2015,7,l);
        Student s3 =  new RegularStudent("1","2",LocalDate.parse("2021-01-01"),2017,9,l);
        Student s4 =  new InServiceStudent("1","An",LocalDate.parse("2021-01-01"),2017,9,l,"ND");
        it.add(s1);
        it.add(s2);
        it.add(s3);
        it.add(s4);

        while (true) {
            System.out.println("1: add regular student");
            System.out.println("2: add in service student");
            System.out.println("3: do not insert");
            String n = scanner.nextLine();
            if (n.equals("1")) {
                System.out.println("id");
                String id = scanner.nextLine();
                System.out.println("name");
                String name = scanner.nextLine();
                System.out.println("birthday");
                String birthday = scanner.nextLine();
                System.out.println("enrolled year");
                int year = scanner.nextInt();
                System.out.println("score");
                scanner.nextLine();
                double score = scanner.nextDouble();
                scanner.nextLine();
                try {
                    Check.isDate(birthday);
                    it.add(new RegularStudent(id,name,LocalDate.parse(birthday),year,score,l));
                }
                catch (DateTimeException e) {
                    System.err.println(e);
                }
            }
            else if (n.equals("2")) {
                System.out.println("id");
                String id = scanner.nextLine();
                System.out.println("name");
                String name = scanner.nextLine();
                System.out.println("birthday");
                String birthday = scanner.nextLine();
                System.out.println("enrolled year");
                int year = scanner.nextInt();
                System.out.println("score");
                scanner.nextLine();
                double score = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("place");
                String place = scanner.nextLine();
                try {
                    Check.isDate(birthday);
                    it.add(new InServiceStudent(id,name,LocalDate.parse(birthday),year,score,l,place));
                }
                catch (DateTimeException e) {
                    System.err.println(e);
                }
            } else if (n.equals("3")) {
                break;
            }
        }
        System.out.println(s3.isRegular());//4

        System.out.println(it.getStudents().get(1).getAvgScoreBySemester(1));//6

        System.out.println(it.getCountRegular());//7

        System.out.println(it.getMax().toString());//8

        it.getPlace("ND").forEach(student -> System.out.println(student.getName()));//9

        it.getLastAvgScore().forEach(student -> System.out.println(student.toString()));//10

        System.out.println(it.getMaxAvgScore().toString());//11

        List<Student> list = it.sortByYear();//12
        list.forEach(i -> System.out.println(i.toString()));

        System.out.println(it.getStudentNumberByYear(2017));//13
    }
}
