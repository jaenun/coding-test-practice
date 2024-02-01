import java.util.*;public class BitTest1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("정수: ");
        int n = scanner.nextInt();
        System.out.print("자릿수: ");
        int k = scanner.nextInt();
        System.out.println((n&(1<<k))==0?0:1);//1->n shift 후 and 연산
        System.out.println((n>>k)&1); // n->1 shift 후 연산

        scanner.close();
    }
}