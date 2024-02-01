import java.util.Scanner;

public class BitTest3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("q, p, x, y? ");
        int q = sc.nextInt();
        int p = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = q;

        int resetP = 0;
        for (int i = 0; i <= y-x; i++)
            resetP |= 1 << i;
        result &= ~(resetP << x);
        result |= p << x;

        System.out.println("q = " + Integer.toBinaryString(q));
        System.out.println("p = " + Integer.toBinaryString(p));
        System.out.println("result = " + Integer.toBinaryString(result) + " : " + result);

        sc.close();
    }
}
