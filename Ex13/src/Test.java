import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        EmployeeManager employeeManager = new EmployeeManager();
        while (true) {
            System.out.println("1: Insert Employee");
            System.out.println("2: Update Employee");
            System.out.println("3: Delete Employee");
            System.out.println("4: Find Employee");
            int n = scanner.nextInt();
            scanner.nextLine();
            if (n == 1) {
                System.out.println("0: Insert Experience");
                System.out.println("1: Insert Fresher");
                System.out.println("2: Insert Intern");
                int m = scanner.nextInt();
                scanner.nextLine();
                if (m == 0) {
                    System.out.println("id");
                    String id = scanner.nextLine();
                    System.out.println("fullName");
                    String fullName = scanner.nextLine();
                    System.out.println("birthDay");
                    String birthDay = scanner.nextLine();
                    System.out.println("phone");
                    String phone = scanner.nextLine();
                    System.out.println("email");
                    String email = scanner.nextLine();
                    System.out.println("year");
                    int year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("skill");
                    String skill = scanner.nextLine();
                    System.out.println("Number of certificate");
                    List<Certificate> cerList = new ArrayList<>();
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= number; i++) {
                        System.out.println("Certificate" + i);
                        System.out.println("ID");
                        String idCer = scanner.nextLine();
                        System.out.println("Name");
                        String nameCer = scanner.nextLine();
                        System.out.println("Rank");
                        String rankCer = scanner.nextLine();
                        System.out.println("Date");
                        String dateCer = scanner.nextLine();
                        cerList.add(new Certificate(idCer,nameCer,rankCer,LocalDate.parse(dateCer)));
                    }
                    try {
                        Check.fullNameCheck(fullName);
                        Check.emailCheck(email);
                        Check.phoneCheck(phone);
                        Check.birthdayCheck(birthDay);
                        Employee experience = new Experience(id, fullName, LocalDate.parse(birthDay), phone, email, cerList, year, skill);
                        employeeManager.insert(experience);
                        Employee.setCount(Employee.getCount()+1);
                        experience.showInfo();
                    }
                    catch (BirthDayException e){
                        System.err.println(e);
                    }
                    catch (PhoneException e) {
                        System.err.println(e);
                    }
                    catch (FullNameException e) {
                        System.err.println(e);
                    }
                    catch (EmailException e) {
                        System.err.println(e);
                    }
                } else if (m == 1) {
                    System.out.println("id");
                    String id = scanner.nextLine();
                    System.out.println("fullName");
                    String fullName = scanner.nextLine();
                    System.out.println("birthDay");
                    String birthDay = scanner.nextLine();
                    System.out.println("phone");
                    String phone = scanner.nextLine();
                    System.out.println("email");
                    String email = scanner.nextLine();
                    System.out.println("graduation date");
                    String date = scanner.nextLine();
                    System.out.println("rank");
                    String rank = scanner.nextLine();
                    System.out.println("name of university");
                    String uniName = scanner.nextLine();
                    System.out.println("Number of certificate");
                    List<Certificate> cerList = new ArrayList<>();
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= number; i++) {
                        System.out.println("Certificate" + i);
                        System.out.println("ID");
                        String idCer = scanner.nextLine();
                        System.out.println("Name");
                        String nameCer = scanner.nextLine();
                        System.out.println("Rank");
                        String rankCer = scanner.nextLine();
                        System.out.println("Date");
                        String dateCer = scanner.nextLine();
                        cerList.add(new Certificate(idCer,nameCer,rankCer,LocalDate.parse(dateCer)));
                    }
                    try {
                        Check.fullNameCheck(fullName);
                        Check.emailCheck(email);
                        Check.phoneCheck(phone);
                        Check.birthdayCheck(birthDay);
                        Employee fresher = new Fresher(id, fullName, LocalDate.parse(birthDay), phone, email, cerList, LocalDate.parse(date), rank,uniName);
                        employeeManager.insert(fresher);
                        Employee.setCount(Employee.getCount()+1);
                        fresher.showInfo();
                    }
                    catch (BirthDayException e){
                        System.err.println(e);
                    }
                    catch (PhoneException e) {
                        System.err.println(e);
                    }
                    catch (FullNameException e) {
                        System.err.println(e);
                    }
                    catch (EmailException e) {
                        System.err.println(e);
                    }
                } else if (m == 2) {
                    System.out.println("id");
                    String id = scanner.nextLine();
                    System.out.println("fullName");
                    String fullName = scanner.nextLine();
                    System.out.println("birthDay");
                    String birthDay = scanner.nextLine();
                    System.out.println("phone");
                    String phone = scanner.nextLine();
                    System.out.println("email");
                    String email = scanner.nextLine();
                    System.out.println("major");
                    String major = scanner.nextLine();
                    System.out.println("semester");
                    int semester = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("name of university");
                    String uniName = scanner.nextLine();
                    System.out.println("Number of certificate");
                    List<Certificate> cerList = new ArrayList<>();
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= number; i++) {
                        System.out.println("Certificate" + i);
                        System.out.println("ID");
                        String idCer = scanner.nextLine();
                        System.out.println("Name");
                        String nameCer = scanner.nextLine();
                        System.out.println("Rank");
                        String rankCer = scanner.nextLine();
                        System.out.println("Date");
                        String dateCer = scanner.nextLine();
                        cerList.add(new Certificate(idCer,nameCer,rankCer,LocalDate.parse(dateCer)));
                    }
                    try {
                        Check.fullNameCheck(fullName);
                        Check.emailCheck(email);
                        Check.phoneCheck(phone);
                        Check.birthdayCheck(birthDay);
                        Employee intern = new Intern(id, fullName, LocalDate.parse(birthDay), phone, email, cerList, major, semester,uniName);
                        employeeManager.insert(intern);
                        Employee.setCount(Employee.getCount()+1);
                        intern.showInfo();
                    }
                    catch (BirthDayException e){
                        System.err.println(e);
                    }
                    catch (PhoneException e) {
                        System.err.println(e);
                    }
                    catch (FullNameException e) {
                        System.err.println(e);
                    }
                    catch (EmailException e) {
                        System.err.println(e);
                    }
                }
                System.out.println(Employee.getCount());
            } else if (n == 2) {
                System.out.println("ID");
                String id = scanner.nextLine();
                Employee e = employeeManager.findByID(id);

                System.out.println("Name");
                String name = scanner.nextLine();
                e.setFullName(name);
                System.out.println("birthDay");
                String birthDay = scanner.nextLine();
                e.setBirthDay(LocalDate.parse(birthDay));
                System.out.println("phone");
                String phone = scanner.nextLine();
                e.setPhone(phone);
                System.out.println("email");
                String email = scanner.nextLine();
                e.setEmail(email);
            } else if (n == 3) {
                System.out.println("ID");
                String id = scanner.nextLine();
                if (employeeManager.findByID(id)!=null) Employee.setCount(Employee.getCount()-1);
                employeeManager.deleteByID(id);
            } else if (n == 4) {
                System.out.println("0: Experience");
                System.out.println("1: Fresher");
                System.out.println("2: Intern");

                int m = scanner.nextInt();
                scanner.nextLine();
                if (!(m==0||m==1||m==2)) continue;
                employeeManager.findByType(m).forEach(s -> s.showInfo());
                FileWriter fileWriter = new FileWriter("src/Employee.txt",true);
                BufferedWriter b1 = new BufferedWriter(fileWriter);
                employeeManager.findByType(m).forEach(s -> {
                    try {
                        b1.write(s.getInfo()+'\'');
                        b1.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
            } else {
                System.out.println("Press from 1 to 4");
            }

        }
    }
}
