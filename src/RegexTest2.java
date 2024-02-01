import java.util.Scanner;
import java.util.regex.Pattern;

public class RegaxTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String regex = "(\\d{2})/(\\d{2})/(\\d{4})";
        System.out.print("날짜를 입력하세요: ");
        String date=sc.nextLine();

        Pattern p = Pattern.compile(regex);

    }
}
