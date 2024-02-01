import java.util.*;
public class BitTest4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("한 변의 크기를 입력하시오(0<n<17):");
        int n = sc.nextInt();
        int [] arr1=new int[n];
        int [] arr2=new int[n];
        for (int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }
        for (int i=0; i<n; i++){
            arr2[i]=sc.nextInt();
        }
    }
}