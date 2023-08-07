import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.DateTimeException;
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
            String n = scanner.nextLine();

            if (n.equals("1")) {
                System.out.println("0: Insert Experience");
                System.out.println("1: Insert Fresher");
                System.out.println("2: Insert Intern");
                String m = scanner.nextLine();
                if (m.equals("0")) {
                    String id, fullName, birthDay, phone, email, skill;
                    int year;
                    boolean kt = true;
                    System.out.println("id");
                    id = scanner.nextLine();
                    while (kt) {
                        if (!employeeManager.checkExist(id)) {
                            kt = false;
                        } else  {
                            System.out.println("Enter ID again");
                            id=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt = true;
                    System.out.println("fullName");
                    fullName = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.fullNameCheck(fullName);
                            kt = false;
                        } catch (FullNameException e) {
                            System.out.println(e + ". " + "Enter fullName again");
                            fullName=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt = true;
                    System.out.println("birthDay");
                    birthDay = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.birthdayCheck(birthDay);
                            kt = false;
                        } catch (BirthDayException e) {
                            System.out.println(e + ". " + "Enter birth day again");
                            birthDay=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("phone");
                    phone = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.phoneCheck(phone);
                            kt = false;
                        } catch (PhoneException e) {
                            System.out.println(e + ". " + "Enter phone number again");
                            phone=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("email");
                    email = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.emailCheck(email);
                            kt = false;
                        } catch (EmailException e) {
                            System.out.println(e + ". " + "Enter email again");
                            email=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("year");
                    year = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("skill");
                    skill = scanner.nextLine();
                    System.out.println("Number of certificate");
                    List<Certificate> cerList = new ArrayList<>();
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= number; i++) {
                        String dateCer;
                        System.out.println("Certificate" + i);
                        System.out.println("ID");
                        String idCer = scanner.nextLine();
                        System.out.println("Name");
                        String nameCer = scanner.nextLine();
                        System.out.println("Rank");
                        String rankCer = scanner.nextLine();
                        System.out.println("Date");
                        dateCer = scanner.nextLine();
                        while (kt) {
                            try {
                                Check.isDate(dateCer);
                                kt = false;
                            } catch (DateTimeException e) {
                                System.out.println(e + ". " + "Enter date again");
                                dateCer=scanner.nextLine();
                                kt=true;
                            }
                        }
                        kt=true;
                        cerList.add(new Certificate(idCer,nameCer,rankCer,LocalDate.parse(dateCer)));
                    }


                        Employee experience = new Experience(id, fullName, LocalDate.parse(birthDay), phone, email, cerList, year, skill);
                        employeeManager.insert(experience);
                        Employee.setCount(Employee.getCount()+1);
                        experience.showInfo();

                } else if (m.equals("1")) {
                    String id,fullName,birthDay,phone,email,date,rank,uniName;
                    boolean kt = true;
                    System.out.println("id");
                    id = scanner.nextLine();
                    while (kt) {
                        if (!employeeManager.checkExist(id)) {
                            kt = false;
                        } else  {
                            System.out.println("Enter ID again");
                            id=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt = true;
                    System.out.println("fullName");
                    fullName = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.fullNameCheck(fullName);
                            kt = false;
                        } catch (FullNameException e) {
                            System.out.println(e + ". " + "Enter name again");
                            fullName=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("birthDay");
                    birthDay = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.birthdayCheck(birthDay);
                            kt = false;
                        } catch (BirthDayException e) {
                            System.out.println(e + ". " + "Enter birthday again");
                            birthDay=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("phone");
                    phone = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.phoneCheck(phone);
                            kt = false;
                        } catch (PhoneException e) {
                            System.out.println(e + ". " + "Enter phone number again");
                            phone=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("email");
                    email = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.emailCheck(email);
                            kt = false;
                        } catch (EmailException e) {
                            System.out.println(e + ". " + "Enter email again");
                            email=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("graduation date");
                    date = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.isDate(date);
                            kt = false;
                        } catch (DateTimeException e) {
                            System.out.println(e + ". " + "Enter date again");
                            date=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("rank");
                    rank = scanner.nextLine();
                    System.out.println("name of university");
                    uniName = scanner.nextLine();
                    System.out.println("Number of certificate");
                    List<Certificate> cerList = new ArrayList<>();
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= number; i++) {
                        String dateCer;
                        System.out.println("Certificate" + i);
                        System.out.println("ID");
                        String idCer = scanner.nextLine();
                        System.out.println("Name");
                        String nameCer = scanner.nextLine();
                        System.out.println("Rank");
                        String rankCer = scanner.nextLine();
                        System.out.println("Date");
                        dateCer = scanner.nextLine();
                        while (kt) {
                            try {
                                Check.isDate(dateCer);
                                kt = false;
                            } catch (DateTimeException e) {
                                System.out.println(e + ". " + "Enter date again");
                                dateCer=scanner.nextLine();
                                kt=true;
                            }
                        }
                        kt=true;
                        cerList.add(new Certificate(idCer,nameCer,rankCer,LocalDate.parse(dateCer)));
                    }
                        Employee fresher = new Fresher(id, fullName, LocalDate.parse(birthDay), phone, email, cerList, LocalDate.parse(date), rank,uniName);
                        employeeManager.insert(fresher);
                        Employee.setCount(Employee.getCount()+1);
                        fresher.showInfo();
                } else if (m.equals("2")) {
                    String id,fullName,birthDay,phone,email,major,uniName;
                    int semester;
                    boolean kt=true;
                    System.out.println("id");
                    id = scanner.nextLine();
                    while (kt) {
                        if (!employeeManager.checkExist(id)) {
                            kt = false;
                        } else  {
                            System.out.println("Enter ID again");
                            id=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt = true;
                    System.out.println("fullName");
                    fullName = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.fullNameCheck(fullName);
                            kt = false;
                        } catch (FullNameException e) {
                            System.out.println(e + ". " + "Enter name again");
                            fullName=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("birthDay");
                    birthDay = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.birthdayCheck(birthDay);
                            kt = false;
                        } catch (BirthDayException e) {
                            System.out.println(e + ". " + "Enter birthday again");
                            birthDay=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("phone");
                    phone = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.phoneCheck(phone);
                            kt = false;
                        } catch (PhoneException e) {
                            System.out.println(e + ". " + "Enter phone number again");
                            phone=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("email");
                    email = scanner.nextLine();
                    while (kt) {
                        try {
                            Check.emailCheck(email);
                            kt = false;
                        } catch (EmailException e) {
                            System.out.println(e + ". " + "Enter email again");
                            email=scanner.nextLine();
                            kt=true;
                        }
                    }
                    kt=true;
                    System.out.println("major");
                    major = scanner.nextLine();
                    System.out.println("semester");
                    semester = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("name of university");
                    uniName = scanner.nextLine();
                    System.out.println("Number of certificate");
                    List<Certificate> cerList = new ArrayList<>();
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    for (int i = 1; i <= number; i++) {
                        String dateCer;
                        System.out.println("Certificate" + i);
                        System.out.println("ID");
                        String idCer = scanner.nextLine();
                        System.out.println("Name");
                        String nameCer = scanner.nextLine();
                        System.out.println("Rank");
                        String rankCer = scanner.nextLine();
                        System.out.println("Date");
                        dateCer = scanner.nextLine();
                        while (kt) {
                            try {
                                Check.isDate(dateCer);
                                kt = false;
                            } catch (DateTimeException e) {
                                System.out.println(e + ". " + "Enter date again");
                                dateCer=scanner.nextLine();
                                kt=true;
                            }
                        }
                        kt=true;
                        cerList.add(new Certificate(idCer,nameCer,rankCer,LocalDate.parse(dateCer)));
                    }

                        Employee intern = new Intern(id, fullName, LocalDate.parse(birthDay), phone, email, cerList, major, semester,uniName);
                        employeeManager.insert(intern);
                        Employee.setCount(Employee.getCount()+1);
                        intern.showInfo();
                }
                System.out.println(Employee.getCount());
            } else if (n.equals("2")) {
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
            } else if (n.equals("3")) {
                System.out.println("ID");
                String id = scanner.nextLine();
                if (employeeManager.findByID(id)!=null) Employee.setCount(Employee.getCount()-1);
                employeeManager.deleteByID(id);
            } else if (n.equals("4")) {
                System.out.println("0: Experience");
                System.out.println("1: Fresher");
                System.out.println("2: Intern");

                int m = scanner.nextInt();
                scanner.nextLine();
                if (!(m==0||m==1||m==2)) continue;
                employeeManager.findByType(m).forEach(s -> s.showInfo());
                employeeManager.findByType(m).forEach(s -> {
                    try {
                        EmployeeManager.printFile(s.getInfo());
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
