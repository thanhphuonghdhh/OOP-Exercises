import java.text.ParseException;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Result r1 = new Result(1,2);
        List<Result> l = new ArrayList<>();
        l.add(r1);
        Student s = new RegularStudent();
        Student s1 =  new RegularStudent("1","2",LocalDate.parse("2021-01-01"),2012,8,l);
        System.out.println(RegularStudent.count);
    }
}
