import java.text.SimpleDateFormat;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Check {

    public static void birthdayCheck(String s) throws BirthDayException {
        try {
            LocalDate.parse(s);
        }
        catch (DateTimeException e) {
            throw new BirthDayException("Ngay sinh khong hop le");
        }

    }


    public static void isDate(String s) throws DateTimeException {
        try {
            LocalDate.parse(s);
        }
        catch (DateTimeException e) {
            throw new DateTimeException("Ngay sinh khong hop le");
        }

    }
    public static void phoneCheck(String phone) throws PhoneException{
        //if (phone.length() != 10) throw new PhoneException("Do dai khong hop le");
        for (int i=0;i<phone.length();i++) {
            if ((phone.charAt(i) - '0' > 9) ||(phone.charAt(i)-'0'<0))
                throw new PhoneException("Ky tu khong hop le");

        }
    }

    public static void fullNameCheck(String name) throws FullNameException{

        for (int i=0;i<name.length();i++) {
            if (!((name.charAt(i) - 'A' >= 0 && name.charAt(i)-'A'<= 25) ||
                    (name.charAt(i) - 'a' >=0 && name.charAt(i)-'a' <=25))) {
                System.out.println(name.charAt(i));
                throw new FullNameException("Ky tu khong hop le");
            }

        }


    }

    public static void emailCheck(String email) throws EmailException{
        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        if (email.matches(regex) == false)
            throw new EmailException("Ky tu khong hop le");
    }
}
