import java.util.Scanner;

// 휴대폰 번호를 입력 받는데, 입력 문자열이 '010-dddd-dddd' 이 아닌 경우 오류를 출력하라. (d는 0~9 사이의 숫자)

public class RegexTest01 {

    public static void main(String[] args) {
        String regex = "010-\\d{4}-\\d{4}";
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("휴대폰 번호를 입력하세요(종료는 q): ");
            String input = sc.nextLine();
            if ("q".equals(input))
                break;
            if (input.matches(regex))
                System.out.println("정확한 전화번호 양식입니다.");
            else
                System.out.println("잘못된 번화번호 양식입니다.");
        }
        sc.close();
    }
}
