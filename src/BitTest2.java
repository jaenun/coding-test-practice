import java.util.Scanner;
public class BitTest2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수: ");
        int n = scanner.nextInt();
        System.out.print("자릿수: ");
        int k = scanner.nextInt();
        int answer=n;
        if(k>0){
            answer=answer|(1<<k);
        }
        else if (k==0){
            k=-k;
            answer=answer&~(1<<k);
        }
        else {
            answer^=answer;
        }
        scanner.close();
    }
}
